package defpackage;

import android.content.SharedPreferences;
import android.content.res.Resources;
import com.google.android.apps.messaging.R;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ajnm implements ajnf, ajnn, cqto {
    private static final cqce g = cqce.g("Bugle", "ConfigurationStore");
    public final ajnw a;
    public final ajnw b;
    public final ajnw c;
    public final SharedPreferences.OnSharedPreferenceChangeListener d;
    public final ajnl e;
    public final crqu f;
    private final crqv h;
    private final crny i;
    private final crma j;
    private final Executor k;

    public ajnm(crqv crqvVar, crqu crquVar, crny crnyVar, crma crmaVar, eosc eoscVar, cqtp cqtpVar, ajny ajnyVar, eigp eigpVar, ajnx ajnxVar) throws Resources.NotFoundException {
        this.h = crqvVar;
        this.f = crquVar;
        this.i = crnyVar;
        this.j = crmaVar;
        this.k = new eoss(eoscVar);
        this.a = ajnxVar;
        ajnz ajnzVarA = ajnyVar.a(R.string.send_seen_report_rcs_pref_key, R.bool.send_seen_report_rcs_pref_default, ajnr.SEND, ajnr.DO_NOT_SEND);
        this.b = ajnzVarA;
        ajnz ajnzVarA2 = ajnyVar.a(R.string.share_typing_status_rcs_pref_key, R.bool.share_typing_status_rcs_pref_default, ajns.SEND, ajns.DO_NOT_SEND);
        this.c = ajnzVarA2;
        ajnl ajnlVar = new ajnl(ekhx.s("rcs_settings_value", ajnzVarA.a, ajnzVarA2.a), cqtpVar.a(this));
        this.e = ajnlVar;
        this.d = new eigb(eigpVar, ajnlVar, "com/google/android/apps/messaging/shared/api/messaging/configuration/ConfigurationStore", "<init>", 104, "ConfigurationStore#init");
    }

    @Override // defpackage.ajnf
    public final cquc a(ajne ajneVar, String str) {
        return this.e.a.a(ajneVar, "Subscribe configuration updates", str, "Unsubscribe configuration updates");
    }

    @Override // defpackage.ajnf
    public final eiju d() {
        eieu eieuVarK = eiiy.k("Load global configuration");
        try {
            eiju eijuVarG = eijx.g(new Callable() { // from class: ajng
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    ajnm ajnmVar = this.a;
                    ajnq ajnqVarC = ((ajnx) ajnmVar.a).c();
                    if (ajnqVarC == null) {
                        throw new NullPointerException("Null rcsSetting");
                    }
                    ajnr ajnrVar = (ajnr) ajnmVar.b.a();
                    if (ajnrVar == null) {
                        throw new NullPointerException("Null readReceiptBehavior");
                    }
                    ajns ajnsVar = (ajns) ajnmVar.c.a();
                    if (ajnsVar != null) {
                        return new ajnb(ajnqVarC, ajnrVar, ajnsVar);
                    }
                    throw new NullPointerException("Null typingIndicatorBehavior");
                }
            }, this.k);
            eieuVarK.b(eijuVarG);
            eieuVarK.close();
            return eijuVarG;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ajnn
    public final eiju e(final ajnp ajnpVar) {
        eieu eieuVarK = eiiy.k("Update global configuration");
        try {
            eiju eijuVarG = eijx.g(new Callable() { // from class: ajnh
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    ajnd ajndVar = (ajnd) ajnpVar;
                    ajnm ajnmVar = this.a;
                    boolean zA = ajnv.a(ajnmVar.a, ajndVar.a);
                    boolean zA2 = ajnv.a(ajnmVar.b, ajndVar.b);
                    boolean zA3 = ajnv.a(ajnmVar.c, ajndVar.c);
                    if (!zA && !zA2 && !zA3) {
                        return null;
                    }
                    ajnmVar.e.a();
                    return null;
                }
            }, this.k);
            eieuVarK.b(eijuVarG);
            eieuVarK.close();
            return eijuVarG;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cqto
    public final void fJ() {
        if (this.j.k()) {
            this.i.o(new crnx() { // from class: ajni
                @Override // defpackage.crnx
                public final boolean a(int i) {
                    ajnm ajnmVar = this.a;
                    ajnmVar.f.a(i).m(ajnmVar.d);
                    return true;
                }
            });
        } else {
            g.r("Cannot register for subscription prefs changes, no phone permission");
        }
        this.h.m(this.d);
    }

    @Override // defpackage.cqto
    public final void fK() {
        if (this.j.k()) {
            this.i.o(new crnx() { // from class: ajnj
                @Override // defpackage.crnx
                public final boolean a(int i) {
                    ajnm ajnmVar = this.a;
                    ajnmVar.f.a(i).o(ajnmVar.d);
                    return true;
                }
            });
        } else {
            g.r("Cannot unregister subscription prefs changes, no phone permission");
        }
        this.h.o(this.d);
    }
}
