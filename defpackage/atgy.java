package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atgy implements atgt {
    public final atgt a;
    public final fdjx b;

    public atgy(atgt atgtVar, fdjx fdjxVar) {
        fdjxVar.getClass();
        this.a = atgtVar;
        this.b = fdjxVar;
    }

    @Override // defpackage.atgt
    public final Object a(athh athhVar, fcxy fcxyVar) {
        throw null;
    }

    public final eiju b(athh athhVar) {
        return auvw.i(this.b, new atgu(this, athhVar, null));
    }

    public final eiju c(MessageCoreData messageCoreData) {
        messageCoreData.getClass();
        return auvw.i(this.b, new atgw(this, messageCoreData, null));
    }

    @Override // defpackage.atgt
    public final Object d(athh athhVar, MessageCoreData messageCoreData, fcxy fcxyVar) {
        throw null;
    }

    public final eiju e(athh athhVar, int i, MessageCoreData messageCoreData) {
        messageCoreData.getClass();
        return auvw.i(this.b, new atgx(this, athhVar, i, messageCoreData, null));
    }

    @Override // defpackage.atgt
    public final Object f(MessageCoreData messageCoreData, fcxy fcxyVar) {
        throw null;
    }

    @Override // defpackage.atgt
    public final Object i(athh athhVar, int i, MessageCoreData messageCoreData, fcxy fcxyVar) {
        throw null;
    }
}
