package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cyio {
    public final List a = new ArrayList();
    private final String b;

    public cyio(String str) {
        this.b = str;
    }

    public final void a(String str, String str2) {
        String[] strArr = buei.a;
        budo budoVar = new budo();
        budoVar.d(this.b);
        budoVar.b(str);
        budoVar.c(str2);
        this.a.add(budoVar.a());
    }

    public final void b(String str) {
        a("", str);
    }
}
