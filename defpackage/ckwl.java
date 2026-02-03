package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckwl {
    public final ckvx a;

    public ckwl(ckvx ckvxVar) {
        this.a = ckvxVar;
    }

    public final ConversationIdType a() {
        return barn.b(this.a.c);
    }

    public final MessageIdType b() {
        return bary.b(this.a.d);
    }

    public final ckmb c() {
        ckmb ckmbVar = this.a.e;
        return ckmbVar == null ? ckmb.a : ckmbVar;
    }

    public final ckmc d() {
        ckmc ckmcVarB = ckmc.b(this.a.g);
        return ckmcVarB == null ? ckmc.UNRECOGNIZED : ckmcVarB;
    }

    public final ckmi e() {
        ckmi ckmiVar = this.a.f;
        return ckmiVar == null ? ckmi.a : ckmiVar;
    }

    public final ckmo f() {
        ckmo ckmoVar = this.a.h;
        return ckmoVar == null ? ckmo.a : ckmoVar;
    }
}
