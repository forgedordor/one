package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayey implements eora {
    final /* synthetic */ MessageIdType a;
    final /* synthetic */ ayez b;

    public ayey(ayez ayezVar, MessageIdType messageIdType) {
        this.a = messageIdType;
        this.b = ayezVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.b.d((crbg) obj, this.a);
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        cqbd cqbdVarE = ayez.a.e();
        cqbdVarE.I("Error in p2p suggestions request");
        cqbdVarE.I(this.a);
        cqbdVarE.s(th);
    }
}
