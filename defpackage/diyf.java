package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class diyf implements fdap {
    final /* synthetic */ fdat a;
    final /* synthetic */ List b;

    public diyf(fdat fdatVar, List list) {
        this.a = fdatVar;
        this.b = list;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int iIntValue = ((Number) obj).intValue();
        return this.a.a(Integer.valueOf(iIntValue), this.b.get(iIntValue));
    }
}
