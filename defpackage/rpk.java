package defpackage;

import java.io.InputStream;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rpk implements rez {
    private final ron a;
    private final rig b;

    public rpk(ron ronVar, rig rigVar) {
        this.a = ronVar;
        this.b = rigVar;
    }

    @Override // defpackage.rez
    public final /* bridge */ /* synthetic */ rhy a(Object obj, int i, int i2, rex rexVar) {
        boolean z;
        rpg rpgVar;
        rux ruxVar;
        InputStream inputStream = (InputStream) obj;
        if (inputStream instanceof rpg) {
            rpgVar = (rpg) inputStream;
            z = false;
        } else {
            z = true;
            rpgVar = new rpg(inputStream, this.b);
        }
        boolean z2 = z;
        Queue queue = rux.a;
        synchronized (queue) {
            ruxVar = (rux) queue.poll();
        }
        if (ruxVar == null) {
            ruxVar = new rux();
        }
        rux ruxVar2 = ruxVar;
        ruxVar2.b = rpgVar;
        rvg rvgVar = new rvg(ruxVar2);
        rpj rpjVar = new rpj(rpgVar, ruxVar2);
        try {
            ron ronVar = this.a;
            rhy rhyVarA = ronVar.a(new roz(rvgVar, ronVar.g, ronVar.f), i, i2, rexVar, rpjVar);
            ruxVar2.a();
            if (z2) {
                rpgVar.b();
            }
            return rhyVarA;
        } finally {
        }
    }

    @Override // defpackage.rez
    public final /* bridge */ /* synthetic */ boolean b(Object obj, rex rexVar) {
        return true;
    }
}
