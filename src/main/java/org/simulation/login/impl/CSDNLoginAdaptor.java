package org.simulation.login.impl;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.util.EntityUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.simulation.login.AbstractLogin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * CSDN登录适配器
 *
 * @name: CSDNLoginAdaptor
 * @author: terwer
 * @date: 2022-01-20 20:17
 **/
public class CSDNLoginAdaptor extends AbstractLogin {

    private static final Logger logger = LoggerFactory.getLogger(CSDNLoginAdaptor.class);

    public CSDNLoginAdaptor(String userName, String password) {
        super(userName, password);
    }

    @Override
    protected void readyLogin() throws Exception {
        logger.debug("readyLogin");

        HttpGet readyGet = null;
        try {
            String readyUrl = getReadyLoginUrl();
            readyGet = new HttpGet(readyUrl);
            HttpResponse response = getUserClient().execute(readyGet);
            HttpEntity entity = response.getEntity();
            String info = EntityUtils.toString(entity);
            Document doc = Jsoup.parseBodyFragment(info);

            logger.debug("doc = " + doc);
        } catch (Exception e) {
            throw e;
        } finally {
            if (readyGet != null) {
                readyGet.releaseConnection();
            }
        }
    }

    @Override
    protected int executeLogin() throws Exception {
        logger.debug("executeLogin");

        return 0;
    }

    @Override
    protected void testLogin() throws Exception {
        logger.debug("testLogin");

    }

    @Override
    protected String getReadyLoginUrl() {
        return "https://passport.csdn.net/loginv3";
    }

    @Override
    protected boolean getNeedAuthCode() {
        return false;
    }

    @Override
    protected String getAuthCodeImageUrl() {
        return null;
    }

    @Override
    protected String getLoginUrl() {
        return null;
    }
}
