package defpackage;

import j$.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqxn {
    private final ains a;
    private final ajky b;
    private final emke c;

    public cqxn(ains ainsVar, ajky ajkyVar) {
        emke emkeVar = (emke) emki.a.createBuilder();
        emkeVar.copyOnWrite();
        emki emkiVar = (emki) emkeVar.instance;
        emkiVar.c = emkf.a(3);
        emkiVar.b |= 1;
        emkeVar.copyOnWrite();
        emki emkiVar2 = (emki) emkeVar.instance;
        emkiVar2.t = emkg.a(5);
        emkiVar2.b |= 131072;
        this.c = emkeVar;
        this.a = ainsVar;
        this.b = ajkyVar;
    }

    public final emki a() {
        return (emki) this.c.build();
    }

    public final void b() {
        final emki emkiVar = (emki) this.c.build();
        this.b.a.a(new Supplier() { // from class: ajkx
            @Override // java.util.function.Supplier
            public final Object get() {
                ellg ellgVar = (ellg) ellh.a.createBuilder();
                ellf ellfVar = ellf.BUGLE_TRANSCODING;
                ellgVar.copyOnWrite();
                ellh ellhVar = (ellh) ellgVar.instance;
                ellhVar.j = ellfVar.f11do;
                ellhVar.b |= 1;
                ellgVar.copyOnWrite();
                ellh ellhVar2 = (ellh) ellgVar.instance;
                emki emkiVar2 = emkiVar;
                emkiVar2.getClass();
                ellhVar2.r = emkiVar2;
                ellhVar2.b |= 512;
                return ellgVar;
            }
        });
    }

    public final void c(int i) {
        emke emkeVar = this.c;
        emkeVar.copyOnWrite();
        emki emkiVar = (emki) emkeVar.instance;
        emki emkiVar2 = emki.a;
        emkiVar.b |= 128;
        emkiVar.j = i;
    }

    public final void d(String str) {
        emke emkeVar = this.c;
        emkh emkhVarA = ajkw.a(str);
        emkeVar.copyOnWrite();
        emki emkiVar = (emki) emkeVar.instance;
        emki emkiVar2 = emki.a;
        emkiVar.i = emkhVarA.a();
        emkiVar.b |= 64;
    }

    public final void e(int i) {
        emke emkeVar = this.c;
        emkeVar.copyOnWrite();
        emki emkiVar = (emki) emkeVar.instance;
        emki emkiVar2 = emki.a;
        emkiVar.b |= 256;
        emkiVar.k = i;
    }

    public final void f(Duration duration) {
        float millis = duration.toMillis();
        float millis2 = TimeUnit.SECONDS.toMillis(1L);
        emke emkeVar = this.c;
        emkeVar.copyOnWrite();
        emki emkiVar = (emki) emkeVar.instance;
        emki emkiVar2 = emki.a;
        emkiVar.b |= 4;
        emkiVar.e = millis / millis2;
    }

    public final void g(int i) {
        emke emkeVar = this.c;
        emkeVar.copyOnWrite();
        emki emkiVar = (emki) emkeVar.instance;
        emki emkiVar2 = emki.a;
        emkiVar.b |= 8;
        emkiVar.f = i;
    }

    public final void h(int i) {
        emke emkeVar = this.c;
        emkeVar.copyOnWrite();
        emki emkiVar = (emki) emkeVar.instance;
        emki emkiVar2 = emki.a;
        emkiVar.b |= 32;
        emkiVar.h = i;
    }

    public final void i(int i) {
        emke emkeVar = this.c;
        emkeVar.copyOnWrite();
        emki emkiVar = (emki) emkeVar.instance;
        emki emkiVar2 = emki.a;
        emkiVar.b |= 262144;
        emkiVar.u = i;
    }

    public final void j(int i) {
        emke emkeVar = this.c;
        emkeVar.copyOnWrite();
        emki emkiVar = (emki) emkeVar.instance;
        emki emkiVar2 = emki.a;
        emkiVar.b |= 16;
        emkiVar.g = i;
    }

    public final void k(Duration duration) {
        float millis = duration.toMillis();
        float millis2 = TimeUnit.SECONDS.toMillis(1L);
        emke emkeVar = this.c;
        emkeVar.copyOnWrite();
        emki emkiVar = (emki) emkeVar.instance;
        emki emkiVar2 = emki.a;
        emkiVar.b |= 2;
        emkiVar.d = millis / millis2;
    }

    public final void l(int i) {
        emke emkeVar = this.c;
        emkeVar.copyOnWrite();
        emki emkiVar = (emki) emkeVar.instance;
        emki emkiVar2 = emki.a;
        emkiVar.b |= 65536;
        emkiVar.s = i;
    }

    public final void m(int i) {
        emke emkeVar = this.c;
        emkeVar.copyOnWrite();
        emki emkiVar = (emki) emkeVar.instance;
        emki emkiVar2 = emki.a;
        emkiVar.b |= 2048;
        emkiVar.n = i;
    }

    public final void n(String str) {
        emke emkeVar = this.c;
        emkh emkhVarA = ajkw.a(str);
        emkeVar.copyOnWrite();
        emki emkiVar = (emki) emkeVar.instance;
        emki emkiVar2 = emki.a;
        emkiVar.l = emkhVarA.a();
        emkiVar.b |= 512;
    }

    public final void o(int i) {
        emke emkeVar = this.c;
        emkeVar.copyOnWrite();
        emki emkiVar = (emki) emkeVar.instance;
        emki emkiVar2 = emki.a;
        emkiVar.b |= 1024;
        emkiVar.m = i;
    }

    public final void p(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            emke emkeVar = this.c;
            emkeVar.copyOnWrite();
            emki emkiVar = (emki) emkeVar.instance;
            emki emkiVar2 = emki.a;
            emkiVar.c = emkf.a(2);
            emkiVar.b = 1 | emkiVar.b;
            return;
        }
        if (i2 != 1) {
            emke emkeVar2 = this.c;
            emkeVar2.copyOnWrite();
            emki emkiVar3 = (emki) emkeVar2.instance;
            emki emkiVar4 = emki.a;
            emkiVar3.c = emkf.a(4);
            emkiVar3.b = 1 | emkiVar3.b;
            return;
        }
        emke emkeVar3 = this.c;
        emkeVar3.copyOnWrite();
        emki emkiVar5 = (emki) emkeVar3.instance;
        emki emkiVar6 = emki.a;
        emkiVar5.c = emkf.a(3);
        emkiVar5.b = 1 | emkiVar5.b;
    }

    public final void q(int i) {
        int i2 = i - 1;
        if (i2 == 1) {
            this.a.e("Bugle.Media.Attachment.Resize.Failure.Video.Error.Counts", 1);
            return;
        }
        if (i2 == 2) {
            this.a.e("Bugle.Media.Attachment.Resize.Failure.Video.Error.Counts", 2);
        } else if (i2 != 3) {
            this.a.e("Bugle.Media.Attachment.Resize.Failure.Video.Error.Counts", 4);
        } else {
            this.a.e("Bugle.Media.Attachment.Resize.Failure.Video.Error.Counts", 3);
        }
    }

    public final void r(int i) {
        int i2;
        switch (i - 1) {
            case 1:
                i2 = 3;
                break;
            case 2:
                i2 = 5;
                break;
            case 3:
                i2 = 6;
                break;
            case 4:
                i2 = 4;
                break;
            case 5:
                i2 = 7;
                break;
            case 6:
                i2 = 8;
                break;
            case 7:
                i2 = 9;
                break;
            case 8:
                i2 = 10;
                break;
            case 9:
                i2 = 14;
                break;
            case 10:
                i2 = 15;
                break;
            case 11:
                i2 = 16;
                break;
            case 12:
                i2 = 17;
                break;
            default:
                i2 = 18;
                break;
        }
        emke emkeVar = this.c;
        emkeVar.copyOnWrite();
        emki emkiVar = (emki) emkeVar.instance;
        emki emkiVar2 = emki.a;
        emkiVar.v = emkd.a(i2);
        emkiVar.b |= 524288;
    }
}
