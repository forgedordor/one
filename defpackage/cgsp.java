package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cgsp extends fcyv {
    /* synthetic */ Object a;
    final /* synthetic */ cgsq b;
    int c;
    axcm d;
    ConversationIdType e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cgsp(cgsq cgsqVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.b = cgsqVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objB = this.b.b(null, null, this);
        return objB == fcyl.a ? objB : new fctk(objB);
    }
}
