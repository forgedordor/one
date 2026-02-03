package defpackage;

import android.util.ArrayMap;
import android.util.Pair;
import android.util.Size;
import android.view.Surface;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bfo implements bkw {
    public bgb a;
    private final bkw b;

    public bfo(bkw bkwVar) {
        this.b = bkwVar;
    }

    private final bbm k(bbm bbmVar) {
        bmx bmxVar;
        if (bbmVar == null) {
            return null;
        }
        bgb bgbVar = this.a;
        if (bgbVar == null) {
            bmxVar = bmx.a;
        } else {
            Pair pair = new Pair(bgbVar.h, bgbVar.i.get(0));
            bmx bmxVar2 = bmx.a;
            ArrayMap arrayMap = new ArrayMap();
            arrayMap.put((String) pair.first, pair.second);
            bmxVar = new bmx(arrayMap);
        }
        this.a = null;
        return new bcq(bbmVar, new Size(bbmVar.c(), bbmVar.b()), new bqv(new bvq(null, bmxVar, bbmVar.e().a())));
    }

    @Override // defpackage.bkw
    public final int a() {
        return this.b.a();
    }

    @Override // defpackage.bkw
    public final int b() {
        return this.b.b();
    }

    @Override // defpackage.bkw
    public final int c() {
        return this.b.c();
    }

    @Override // defpackage.bkw
    public final int d() {
        return this.b.d();
    }

    @Override // defpackage.bkw
    public final Surface e() {
        return this.b.e();
    }

    @Override // defpackage.bkw
    public final bbm f() {
        return k(this.b.f());
    }

    @Override // defpackage.bkw
    public final bbm g() {
        return k(this.b.g());
    }

    @Override // defpackage.bkw
    public final void h() {
        this.b.h();
    }

    @Override // defpackage.bkw
    public final void i() {
        this.b.i();
    }

    @Override // defpackage.bkw
    public final void j(final bkv bkvVar, Executor executor) {
        this.b.j(new bkv() { // from class: bfn
            @Override // defpackage.bkv
            public final void a(bkw bkwVar) {
                bkvVar.a(this.a);
            }
        }, executor);
    }
}
