package defpackage;

import android.net.Uri;
import com.android.vcard.VCardConstants;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxpo implements bxor {
    public static final cqce a = cqce.g("BugleDataModel", "HandlersToDownloadCallbackAdapter");
    public final Set b = new CopyOnWriteArraySet();
    private final eosc c;
    private final eosc d;

    public bxpo(eosc eoscVar, eosc eoscVar2) {
        this.c = eoscVar;
        this.d = eoscVar2;
    }

    @Override // defpackage.bxor
    public final void a(final Uri uri, Throwable th) {
        cqbd cqbdVarE = a.e();
        cqbdVarE.I("Download failed, notifying callbacks");
        cqbdVarE.A(VCardConstants.PROPERTY_URL, uri);
        cqbdVarE.s(th);
        Set<bxqj> set = this.b;
        for (final bxqj bxqjVar : set) {
            c(new Runnable() { // from class: bxpk
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        bxqjVar.b(uri.toString());
                    } catch (RuntimeException e) {
                        bxpo.a.s("Error while calling #onFailure", e);
                    }
                }
            });
        }
        set.clear();
    }

    final void b(Set set) {
        this.b.addAll(set);
    }

    public final void c(Runnable runnable) {
        eika.l(eijx.f(runnable, this.c), new bxpn(), this.d);
    }
}
