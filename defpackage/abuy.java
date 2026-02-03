package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abuy extends fcyz implements fdat {
    final /* synthetic */ abvc a;
    final /* synthetic */ MessageIdType b;
    final /* synthetic */ String c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abuy(fcxy fcxyVar, abvc abvcVar, MessageIdType messageIdType, String str) {
        super(2, fcxyVar);
        this.a = abvcVar;
        this.b = messageIdType;
        this.c = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((abuy) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        MessageIdType messageIdType = this.b;
        abvc abvcVar = this.a;
        abvcVar.c.d("EmotifyReactionDatabaseUpdater::lookForReactionAndUpdateDatabase", new abvb(messageIdType, abvcVar, this.c));
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        abuy abuyVar = new abuy(fcxyVar, this.a, this.b, this.c);
        abuyVar.d = obj;
        return abuyVar;
    }
}
