package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eyhe implements eyhx {
    public final lxq a;
    public final Context b;
    private volatile eygp c;
    private final Object d = new Object();

    /* compiled from: PG */
    public interface a {
        ahhl iB();
    }

    /* compiled from: PG */
    public interface b {
        eyha N();
    }

    public eyhe(abi abiVar) {
        this.a = abiVar;
        this.b = abiVar;
    }

    public static final lxo a(lxq lxqVar, Context context) {
        return new lxo(lxqVar, new eyhd(context));
    }

    @Override // defpackage.eyhx
    public final /* bridge */ /* synthetic */ Object bb() {
        if (this.c == null) {
            synchronized (this.d) {
                if (this.c == null) {
                    this.c = ((eyhf) a(this.a, this.b).a(eyhf.class)).a;
                }
            }
        }
        return this.c;
    }
}
