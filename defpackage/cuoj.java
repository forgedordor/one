package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.format.Formatter;
import com.google.android.apps.messaging.R;
import j$.util.DesugarArrays;
import j$.util.function.Predicate$CC;
import java.util.Arrays;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuoj extends cuoo {
    private final cqmp g;
    private final crqv h;

    public cuoj(Context context, cqmp cqmpVar, crqv crqvVar) {
        super(context);
        this.g = cqmpVar;
        this.h = crqvVar;
    }

    static int a(int i) {
        float f = i;
        float f2 = 1.0f;
        while (f > 1024.0f) {
            f /= 1024.0f;
            f2 *= 1000.0f;
        }
        return (int) (f2 * f);
    }

    @Override // defpackage.cuoo
    protected final void b(int i) throws Resources.NotFoundException {
        Context context = this.a;
        String[] stringArray = context.getResources().getStringArray(R.array.rcs_mobile_data_auto_download_limit_entries);
        this.h.l(context.getString(R.string.rcs_mobile_data_auto_download_limit_pref_key), stringArray[i]);
        d();
    }

    @Override // defpackage.cuoo
    protected final void c() throws NumberFormatException {
        Context context = this.a;
        crqv crqvVar = this.h;
        final String string = context.getString(R.string.rcs_mobile_data_auto_download_limit_disable_entry);
        String string2 = context.getString(R.string.rcs_mobile_data_auto_download_limit_default_entry);
        String strF = crqvVar.f(context.getString(R.string.rcs_mobile_data_auto_download_limit_pref_key), context.getString(R.string.rcs_mobile_data_auto_download_limit_default_entry));
        cqmp cqmpVar = this.g;
        String[] stringArray = cqmpVar.f() ? context.getResources().getStringArray(R.array.rcs_mobile_data_auto_download_limit_entries) : (String[]) DesugarArrays.stream(context.getResources().getStringArray(R.array.rcs_mobile_data_auto_download_limit_entries)).filter(new Predicate() { // from class: cuoh
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo538negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return !((String) obj).equals(string);
            }
        }).toArray(new IntFunction() { // from class: cuoi
            @Override // java.util.function.IntFunction
            public final Object apply(int i) {
                return new String[i];
            }
        });
        this.d = Arrays.asList(stringArray).indexOf(strF);
        for (int i = 0; i < stringArray.length; i++) {
            String shortFileSize = stringArray[i];
            if (shortFileSize.equals(string)) {
                shortFileSize = context.getString(R.string.rcs_mobile_data_auto_download_limit_disable_entry_text);
            } else if (shortFileSize.equals(string2)) {
                shortFileSize = cqmpVar.f() ? context.getString(R.string.rcs_mobile_data_auto_download_carrier_format_entry, Formatter.formatShortFileSize(context, a(cqmpVar.e()))) : context.getString(R.string.rcs_mobile_data_auto_download_carrier_format_entry, context.getString(R.string.rcs_mobile_data_auto_download_limit_disable_entry_text));
            } else {
                int i2 = Integer.parseInt(shortFileSize);
                if (i2 != 0) {
                    shortFileSize = Formatter.formatShortFileSize(context, i2);
                }
            }
            stringArray[i] = shortFileSize;
        }
        this.b = context.getString(R.string.set_rcs_mobile_data_auto_download_limit_title);
        this.c = stringArray;
        super.c();
    }
}
