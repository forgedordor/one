package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import j$.util.Objects;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cupo extends cuoo {
    private final crpp g;
    private String[] h;
    private String[] i;
    private String[] j;
    private Locale k;

    public cupo(Context context, crpp crppVar) {
        super(context);
        this.g = crppVar;
    }

    private static int a(String[] strArr, String str) {
        if (strArr == null) {
            return -1;
        }
        for (int i = 0; i < strArr.length; i++) {
            if (TextUtils.equals(strArr[i], str)) {
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.cuoo
    protected final void b(int i) {
        int iA;
        cqaz.d(i, 0, this.j.length - 1);
        String str = (i <= 0 || (iA = a(this.i, this.j[i])) < 0) ? "auto" : this.h[iA];
        crpp crppVar = this.g;
        crppVar.a.l(crppVar.b(), str);
    }

    @Override // defpackage.cuoo
    protected final void c() {
        Context context = this.a;
        int iA = 0;
        Locale localeF = lad.a(context.getResources().getConfiguration()).f(0);
        if (!Objects.equals(this.k, localeF)) {
            this.k = localeF;
            String[] iSOCountries = Locale.getISOCountries();
            this.h = iSOCountries;
            this.i = new String[iSOCountries.length];
            int i = 0;
            while (true) {
                String[] strArr = this.h;
                if (i >= strArr.length) {
                    break;
                }
                this.i[i] = new Locale("", strArr[i]).getDisplayCountry(this.k);
                i++;
            }
            String[] strArr2 = new String[this.i.length + 1];
            this.j = strArr2;
            strArr2[0] = context.getString(R.string.auto_detected_country);
            String[] strArr3 = this.i;
            System.arraycopy(strArr3, 0, this.j, 1, strArr3.length);
            String[] strArr4 = this.j;
            Arrays.sort(strArr4, 1, strArr4.length);
        }
        this.b = context.getString(R.string.current_country_pref_title);
        this.c = this.j;
        String strA = this.g.a();
        if (!crpq.a(strA)) {
            int iA2 = a(this.h, strA);
            iA = iA2 < 0 ? -1 : a(this.j, this.i[iA2]);
        }
        this.d = iA;
        super.c();
    }
}
