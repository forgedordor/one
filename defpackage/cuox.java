package defpackage;

import android.content.Context;
import android.content.Intent;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cuox implements fdat {
    final /* synthetic */ List a;
    final /* synthetic */ Context b;
    final /* synthetic */ Intent c;

    public cuox(List list, Context context, Intent intent) {
        this.a = list;
        this.b = context;
        this.c = intent;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            hnj.b(new hpu[0], hxe.d(1927811206, new cuow(this.a, this.b, this.c), hmlVar), hmlVar, 48);
        }
        return fctx.a;
    }
}
