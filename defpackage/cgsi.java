package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cgsi extends fcyv {
    /* synthetic */ Object a;
    final /* synthetic */ cgsj b;
    int c;
    ConversationIdType d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cgsi(cgsj cgsjVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.b = cgsjVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objB = this.b.b(null, null, this);
        return objB == fcyl.a ? objB : new fctk(objB);
    }
}
