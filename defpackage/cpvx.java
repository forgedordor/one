package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cpvx {
    public final fcsu a;

    public cpvx(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        this.a = fcsuVar2;
    }

    public static final cpyx a(MessageIdType messageIdType) {
        return new cpyx("Cannot create message reply. CmsId does not exist for replied-to message.", ekgb.r(new cpyp(messageIdType.toString(), 3)));
    }
}
