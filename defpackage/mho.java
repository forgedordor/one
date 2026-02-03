package defpackage;

import android.graphics.BitmapFactory;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mho implements mei {
    public static final /* synthetic */ int d = 0;
    public final eosc a;
    public final mhk b;
    public final BitmapFactory.Options c;

    static {
        ejxx.a(new ejxr() { // from class: mhm
            @Override // defpackage.ejxr
            public final Object get() {
                int i = mho.d;
                return eosj.a(Executors.newSingleThreadExecutor());
            }
        });
    }

    public mho(eosc eoscVar, mhk mhkVar, BitmapFactory.Options options) {
        this.a = eoscVar;
        this.b = mhkVar;
        this.c = options;
    }
}
