package com.google.android.ims.rcsservice.chatsession.message.groupmanagement;

import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequestOrResponse;
import defpackage.dhja;
import defpackage.dhlf;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class GroupData {
    public static final String XML_TAG = "group-data";
    private final GroupManagementRequestOrResponse requestOrResponse;

    public GroupData(GroupManagementRequest groupManagementRequest) {
        this.requestOrResponse = GroupManagementRequestOrResponse.ofRequest(groupManagementRequest);
    }

    static GroupData deserialize(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int iNextTag = xmlPullParser.nextTag();
        String namespace = xmlPullParser.getNamespace();
        String name = xmlPullParser.getName();
        GroupManagementRequest groupManagementRequestDeserialize = null;
        GroupManagementResponse groupManagementResponseDeserialize = null;
        while (true) {
            if (iNextTag == 3 && name.equals(XML_TAG)) {
                break;
            }
            if (CpmGroupManagement.NAMESPACE.equals(namespace)) {
                if (name.equals(GroupManagementRequest.XML_TAG)) {
                    groupManagementRequestDeserialize = GroupManagementRequest.deserialize(xmlPullParser);
                } else if (name.equals(GroupManagementResponse.XML_TAG)) {
                    groupManagementResponseDeserialize = GroupManagementResponse.deserialize(xmlPullParser);
                }
            }
            if (xmlPullParser.getEventType() == 2) {
                dhlf.e(xmlPullParser);
            }
            iNextTag = xmlPullParser.nextTag();
            namespace = xmlPullParser.getNamespace();
            name = xmlPullParser.getName();
        }
        if (groupManagementRequestDeserialize != null && groupManagementResponseDeserialize != null) {
            throw new IllegalArgumentException("group-data has both request and response element");
        }
        if (groupManagementRequestDeserialize != null) {
            return new GroupData(groupManagementRequestDeserialize);
        }
        if (groupManagementResponseDeserialize != null) {
            return new GroupData(groupManagementResponseDeserialize);
        }
        dhja.q("group-data has neither request or response element", new Object[0]);
        return null;
    }

    public GroupManagementRequestOrResponse getRequestOrResponse() {
        return this.requestOrResponse;
    }

    public void serialize(XmlSerializer xmlSerializer) throws IllegalStateException, IOException, IllegalArgumentException {
        xmlSerializer.startTag(CpmGroupManagement.NAMESPACE, XML_TAG);
        if (this.requestOrResponse.getKind() == GroupManagementRequestOrResponse.Kind.REQUEST) {
            this.requestOrResponse.request().serialize(xmlSerializer);
        } else if (this.requestOrResponse.getKind() == GroupManagementRequestOrResponse.Kind.RESPONSE) {
            this.requestOrResponse.response().serialize(xmlSerializer);
        }
        xmlSerializer.endTag(CpmGroupManagement.NAMESPACE, XML_TAG);
    }

    public GroupData(GroupManagementResponse groupManagementResponse) {
        this.requestOrResponse = GroupManagementRequestOrResponse.ofResponse(groupManagementResponse);
    }
}
