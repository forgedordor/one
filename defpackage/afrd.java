package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afrd implements afqn {
    public final Context a;
    public final fdjx b;
    public final wre c;
    public final fcsu d;
    public final aqgt e;
    public final aqgx f;
    public final AtomicBoolean g;
    public final dpfy h;
    private final dnjk i;
    private final fdvc j;

    public afrd(Context context, fdjx fdjxVar, wre wreVar, fcsu fcsuVar, afre afreVar, afph afphVar, aqgt aqgtVar, aqgx aqgxVar) {
        context.getClass();
        fdjxVar.getClass();
        wreVar.getClass();
        fcsuVar.getClass();
        afreVar.getClass();
        afphVar.getClass();
        this.a = context;
        this.b = fdjxVar;
        this.c = wreVar;
        this.d = fcsuVar;
        this.e = aqgtVar;
        this.f = aqgxVar;
        this.g = new AtomicBoolean(false);
        auvw.k(afphVar.b, afphVar.a, null, new afpg(afphVar, null), 2);
        dnjk dnjkVar = new dnjk() { // from class: afqo
            @Override // defpackage.dnjk
            public final void a(String str) {
                str.getClass();
                afrd afrdVar = this.a;
                if (afrdVar.g.compareAndSet(false, true)) {
                    afxx.d((afxx) afrdVar.d.b(), 13, 0, 0, 6);
                }
                auvw.k(afrdVar.b, null, null, new afrb(str, afrdVar, null), 3);
            }
        };
        this.i = dnjkVar;
        dpfy dpfyVar = new dpfy(dnjkVar, (dnhm) null, 6);
        this.h = dpfyVar;
        fdua fduaVar = new fdua(new afqz(wreVar.a), afreVar.a, new afrc(this, null));
        fdus fdusVar = fdur.b;
        String string = context.getString(R.string.multi_share_bottom_compose_row_text_placeholder);
        string.getClass();
        this.j = fdtg.b(fduaVar, fdjxVar, fdusVar, new djcv(dpfyVar, "", string, null, 0, false, null, new djcu(aqgtVar.a(), 2), 120));
        auvw.k(fdjxVar, null, null, new afqw(this, null), 3);
    }

    @Override // defpackage.afqn
    public final fdvc a() {
        return this.j;
    }
}
