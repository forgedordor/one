package defpackage;

import android.content.Context;
import android.text.format.DateFormat;
import android.text.format.DateUtils;
import java.text.SimpleDateFormat;
import java.util.Formatter;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaxw {
    public final ejxr a;
    public final ejxr b;
    public final Context c;
    private final ejxr d = ejxx.a(new ejxr() { // from class: aaxn
        @Override // defpackage.ejxr
        public final Object get() {
            return new SimpleDateFormat("h:mm aa", Locale.US);
        }
    });
    private final ejxr e;
    private final ejxr f;
    private final ejxr g;
    private final ejxr h;

    public aaxw(Context context) {
        ejxx.a(new ejxr() { // from class: aaxo
            @Override // defpackage.ejxr
            public final Object get() {
                return new SimpleDateFormat("MMM d, h:mm aa", Locale.US);
            }
        });
        this.e = ejxx.a(new ejxr() { // from class: aaxp
            @Override // defpackage.ejxr
            public final Object get() {
                return new SimpleDateFormat("EEE, MMM d, h:mm aa", Locale.US);
            }
        });
        this.f = ejxx.a(new ejxr() { // from class: aaxq
            @Override // defpackage.ejxr
            public final Object get() {
                return new SimpleDateFormat("H:mm", Locale.US);
            }
        });
        ejxx.a(new ejxr() { // from class: aaxr
            @Override // defpackage.ejxr
            public final Object get() {
                return new SimpleDateFormat("MMM d, H:mm", Locale.US);
            }
        });
        this.g = ejxx.a(new ejxr() { // from class: aaxs
            @Override // defpackage.ejxr
            public final Object get() {
                return new SimpleDateFormat("EEE, MMM d, H:mm", Locale.US);
            }
        });
        this.a = ejxx.a(new ejxr() { // from class: aaxt
            @Override // defpackage.ejxr
            public final Object get() {
                return new SimpleDateFormat("EEE, MMM d", Locale.US);
            }
        });
        this.b = ejxx.a(new ejxr() { // from class: aaxu
            @Override // defpackage.ejxr
            public final Object get() {
                return new StringBuilder();
            }
        });
        this.h = ejxx.a(new ejxr() { // from class: aaxv
            @Override // defpackage.ejxr
            public final Object get() {
                return new Formatter((Appendable) this.a.b.get());
            }
        });
        this.c = context;
    }

    public final String a(Context context, long j, int i) {
        ((StringBuilder) this.b.get()).setLength(0);
        return DateUtils.formatDateRange(context, (Formatter) this.h.get(), j, j, i).toString();
    }

    public final String b(long j) {
        Context context = this.c;
        if (craf.c(context).equals(Locale.US)) {
            return (DateFormat.is24HourFormat(context) ? (SimpleDateFormat) this.f.get() : (SimpleDateFormat) this.d.get()).format(Long.valueOf(j));
        }
        return a(context, j, 1);
    }

    public final String c(long j) {
        Context context = this.c;
        if (craf.c(context).equals(Locale.US)) {
            return (DateFormat.is24HourFormat(context) ? (SimpleDateFormat) this.g.get() : (SimpleDateFormat) this.e.get()).format(Long.valueOf(j));
        }
        return a(context, j, 98323);
    }
}
