package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvbn extends cuoo {
    public final cvbm g;
    private final eigp h;
    private final ains i;
    private final int j;
    private cvbb[] k;

    public cvbn(Context context, cvbm cvbmVar, eigp eigpVar, ains ainsVar, int i, String str) {
        super(context);
        this.g = cvbmVar;
        this.h = eigpVar;
        this.i = ainsVar;
        this.j = i;
        this.b = str;
    }

    public static CharSequence e(Context context, cvbb cvbbVar) {
        int iOrdinal = cvbbVar.ordinal();
        if (iOrdinal == 0) {
            return context.getString(R.string.action_off);
        }
        if (iOrdinal == 1) {
            return context.getString(R.string.action_archive);
        }
        if (iOrdinal == 2) {
            return context.getString(R.string.action_delete);
        }
        if (iOrdinal == 3) {
            return context.getString(R.string.action_mark_as_read_or_unread);
        }
        throw new UnsupportedOperationException("Unsupported Swipe action value");
    }

    public final cvbb a() {
        return this.k[this.d];
    }

    @Override // defpackage.cuoo
    protected final void b(int i) {
        eieh eiehVarC = this.h.c("saveSwipeSetting", "com/google/android/apps/messaging/ui/appsettings/SwipeActionSettingsDialog", "onSelectionChanged", 69);
        try {
            cvbb cvbbVarA = a();
            this.d = i;
            final cvbb cvbbVarA2 = a();
            if (cvbbVarA != cvbbVarA2) {
                this.i.e("Bugle.Settings.Swipe.Update.Count", cvbbVarA2.e);
            }
            if (this.j == R.string.swipe_left_key) {
                final cvbm cvbmVar = this.g;
                ecjh ecjhVar = (ecjh) cvbmVar.e.b();
                ejvr ejvrVar = new ejvr() { // from class: cvbg
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        cvaz cvazVar = (cvaz) ((cvbc) obj).toBuilder();
                        cvazVar.copyOnWrite();
                        cvbc cvbcVar = (cvbc) cvazVar.instance;
                        cvbcVar.c = cvbbVarA2.e;
                        cvbcVar.b |= 1;
                        return (cvbc) cvazVar.build();
                    }
                };
                eoqg eoqgVar = eoqg.a;
                eiju.g(ecjhVar.b(ejvrVar, eoqgVar)).h(new ejvr() { // from class: cvbh
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        cvbmVar.c(cvbm.b);
                        return null;
                    }
                }, eoqgVar).k(auvh.b(), eoqgVar);
            } else {
                final cvbm cvbmVar2 = this.g;
                ecjh ecjhVar2 = (ecjh) cvbmVar2.e.b();
                ejvr ejvrVar2 = new ejvr() { // from class: cvbe
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        cvaz cvazVar = (cvaz) ((cvbc) obj).toBuilder();
                        cvazVar.copyOnWrite();
                        cvbc cvbcVar = (cvbc) cvazVar.instance;
                        cvbcVar.d = cvbbVarA2.e;
                        cvbcVar.b |= 2;
                        return (cvbc) cvazVar.build();
                    }
                };
                eoqg eoqgVar2 = eoqg.a;
                eiju.g(ecjhVar2.b(ejvrVar2, eoqgVar2)).h(new ejvr() { // from class: cvbf
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        cvbmVar2.c(cvbm.c);
                        return null;
                    }
                }, eoqgVar2).k(auvh.b(), eoqgVar2);
            }
            d();
            eiehVarC.close();
        } catch (Throwable th) {
            try {
                eiehVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cuoo
    protected final void c() {
        cvbb[] cvbbVarArrD = cvbm.d();
        this.k = cvbbVarArrD;
        int length = cvbbVarArrD.length;
        CharSequence[] charSequenceArr = new CharSequence[4];
        int i = 0;
        while (true) {
            int length2 = cvbbVarArrD.length;
            if (i >= 4) {
                this.c = charSequenceArr;
                this.b = this.b;
                super.c();
                return;
            }
            charSequenceArr[i] = e(this.a, cvbbVarArrD[i]);
            i++;
        }
    }
}
