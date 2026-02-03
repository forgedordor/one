package defpackage;

import android.text.TextUtils;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eugp extends ejvp {
    @Override // defpackage.ejvp
    public final /* bridge */ /* synthetic */ int a(Object obj) {
        kxa kxaVar = (kxa) obj;
        return Arrays.hashCode(new Object[]{kxaVar.d, kxaVar.a, kxaVar.c});
    }

    @Override // defpackage.ejvp
    protected final /* bridge */ /* synthetic */ boolean b(Object obj, Object obj2) {
        kxa kxaVar = (kxa) obj;
        kxa kxaVar2 = (kxa) obj2;
        return ejwh.a(kxaVar.d, kxaVar2.d) && TextUtils.equals(kxaVar.a, kxaVar2.a) && ejwh.a(kxaVar.c, kxaVar2.c);
    }
}
