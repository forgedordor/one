package com.google.android.ims.rcsservice.chatsession.message.groupmanagement;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class GroupManagementDeserializer {
    private GroupManagementDeserializer() {
    }

    public static CpmGroupManagement parseCpmGroupManagement(byte[] bArr) throws XmlPullParserException, IOException {
        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr), "utf-8");
        xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
        int iNextTag = xmlPullParserNewPullParser.nextTag();
        String namespace = xmlPullParserNewPullParser.getNamespace();
        String name = xmlPullParserNewPullParser.getName();
        if (iNextTag == 2 && CpmGroupManagement.NAMESPACE.equals(namespace) && CpmGroupManagement.XML_TAG.equals(name)) {
            return CpmGroupManagement.deserialize(xmlPullParserNewPullParser);
        }
        throw new IllegalArgumentException("Attempting to parse content that is not a cpm-group-management message with proper namespace.");
    }
}
