package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afxl implements fdap {
    final /* synthetic */ fdat a;
    final /* synthetic */ List b;

    public afxl(fdat fdatVar, List list) {
        this.a = fdatVar;
        this.b = list;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int iIntValue = ((Number) obj).intValue();
        return this.a.a(Integer.valueOf(iIntValue), this.b.get(iIntValue));
    }
}
