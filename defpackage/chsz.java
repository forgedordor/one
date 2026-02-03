package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class chsz extends fcyv {
    /* synthetic */ Object a;
    final /* synthetic */ chtk b;
    int c;
    ConversationIdType d;
    int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chsz(chtk chtkVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.b = chtkVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objK = this.b.k(null, 0, this);
        return objK == fcyl.a ? objK : new fctk(objK);
    }
}
