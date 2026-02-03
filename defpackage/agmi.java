package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agmi extends fcyv {
    boolean a;
    /* synthetic */ Object b;
    final /* synthetic */ agmk c;
    int d;
    MessageIdType e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agmi(agmk agmkVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.c = agmkVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, false, this);
    }
}
