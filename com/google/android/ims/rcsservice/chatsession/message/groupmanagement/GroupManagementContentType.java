package com.google.android.ims.rcsservice.chatsession.message.groupmanagement;

import com.google.android.rcs.client.messaging.data.ContentType;
import defpackage.efil;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class GroupManagementContentType {
    public static final String CONTENT_TYPE = "application/vnd.oma.cpm-groupdata+xml";
    public static final ContentType CPM_GROUP_DATA_CONTENT_TYPE;

    static {
        efil efilVarD = ContentType.d();
        efilVarD.f("application");
        efilVarD.e("vnd.oma.cpm-groupdata+xml");
        CPM_GROUP_DATA_CONTENT_TYPE = efilVarD.g();
    }

    private GroupManagementContentType() {
    }
}
