package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehpt implements ehpl {
    public final lvj a;
    public final fdjx b;
    public final ehpu c;
    public final ehpg d;

    public ehpt(lvj lvjVar, fdjx fdjxVar, ehpg ehpgVar) {
        this.a = lvjVar;
        this.b = fdjxVar;
        this.d = ehpgVar;
        this.c = (ehpu) ehpgVar.b(R.id.lifecycle_channel_mixin, lvjVar, new ehow() { // from class: ehpo
            @Override // defpackage.ehow
            public final Object a() {
                return new ehpu(null);
            }
        });
        lvjVar.P().c(new ehpp(this));
    }

    @Override // defpackage.ehpl
    public final ehpi a(fdvc fdvcVar) {
        throw null;
    }
}
