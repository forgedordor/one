package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mdj {
    public mdk a;
    private final ekgb b;
    private final List c = new ArrayList();
    private ByteBuffer[] d = new ByteBuffer[0];
    private mdk e;
    private boolean f;

    public mdj(ekgb ekgbVar) {
        this.b = ekgbVar;
        mdk mdkVar = mdk.a;
        this.a = mdkVar;
        this.e = mdkVar;
        this.f = false;
    }

    private final int i() {
        return this.d.length - 1;
    }

    private final void j(ByteBuffer byteBuffer) {
        boolean z;
        do {
            int i = 0;
            z = false;
            while (i <= i()) {
                if (!this.d[i].hasRemaining()) {
                    List list = this.c;
                    mdm mdmVar = (mdm) list.get(i);
                    if (!mdmVar.i()) {
                        ByteBuffer byteBuffer2 = i > 0 ? this.d[i - 1] : byteBuffer.hasRemaining() ? byteBuffer : mdm.a;
                        long jRemaining = byteBuffer2.remaining();
                        mdmVar.f(byteBuffer2);
                        this.d[i] = mdmVar.c();
                        boolean z2 = true;
                        if (jRemaining - byteBuffer2.remaining() <= 0 && !this.d[i].hasRemaining()) {
                            z2 = false;
                        }
                        z |= z2;
                    } else if (!this.d[i].hasRemaining() && i < i()) {
                        ((mdm) list.get(i + 1)).e();
                    }
                }
                i++;
            }
        } while (z);
    }

    public final mdk a(mdk mdkVar) throws mdl {
        if (mdkVar.equals(mdk.a)) {
            throw new mdl(mdkVar);
        }
        int i = 0;
        while (true) {
            ekgb ekgbVar = this.b;
            if (i >= ((ekoe) ekgbVar).c) {
                this.e = mdkVar;
                return mdkVar;
            }
            mdm mdmVar = (mdm) ekgbVar.get(i);
            mdk mdkVarB = mdmVar.b(mdkVar);
            if (mdmVar.h()) {
                mee.c(!mdkVarB.equals(r0));
                mdkVar = mdkVarB;
            }
            i++;
        }
    }

    public final ByteBuffer b() {
        if (!h()) {
            return mdm.a;
        }
        ByteBuffer byteBuffer = this.d[i()];
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        j(mdm.a);
        return this.d[i()];
    }

    public final void c() {
        List list = this.c;
        list.clear();
        this.a = this.e;
        this.f = false;
        int i = 0;
        while (true) {
            ekgb ekgbVar = this.b;
            if (i >= ((ekoe) ekgbVar).c) {
                break;
            }
            mdm mdmVar = (mdm) ekgbVar.get(i);
            mdmVar.d();
            if (mdmVar.h()) {
                list.add(mdmVar);
            }
            i++;
        }
        this.d = new ByteBuffer[list.size()];
        for (int i2 = 0; i2 <= i(); i2++) {
            this.d[i2] = ((mdm) list.get(i2)).c();
        }
    }

    public final void d() {
        if (!h() || this.f) {
            return;
        }
        this.f = true;
        ((mdm) this.c.get(0)).e();
    }

    public final void e(ByteBuffer byteBuffer) {
        if (!h() || this.f) {
            return;
        }
        j(byteBuffer);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mdj)) {
            return false;
        }
        ekgb ekgbVar = this.b;
        ekgb ekgbVar2 = ((mdj) obj).b;
        int i = ((ekoe) ekgbVar2).c;
        int i2 = ((ekoe) ekgbVar).c;
        if (i2 != i) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (ekgbVar.get(i3) != ekgbVar2.get(i3)) {
                return false;
            }
        }
        return true;
    }

    public final void f() {
        int i = 0;
        while (true) {
            ekgb ekgbVar = this.b;
            if (i >= ((ekoe) ekgbVar).c) {
                this.d = new ByteBuffer[0];
                mdk mdkVar = mdk.a;
                this.a = mdkVar;
                this.e = mdkVar;
                this.f = false;
                return;
            }
            mdm mdmVar = (mdm) ekgbVar.get(i);
            mdmVar.d();
            mdmVar.g();
            i++;
        }
    }

    public final boolean g() {
        return this.f && ((mdm) this.c.get(i())).i() && !this.d[i()].hasRemaining();
    }

    public final boolean h() {
        return !this.c.isEmpty();
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
