package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.GeneralPurposeRichCardLayoutInfo;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kry {
    public int b;
    public boolean c;
    public final krz d;
    public kry e;
    public kqj h;
    public final int i;
    public HashSet a = null;
    public int f = 0;
    int g = Integer.MIN_VALUE;

    public kry(krz krzVar, int i) {
        this.d = krzVar;
        this.i = i;
    }

    public final int a() {
        if (this.c) {
            return this.b;
        }
        return 0;
    }

    public final int b() {
        kry kryVar;
        if (this.d.ar == 8) {
            return 0;
        }
        int i = this.g;
        return (i == Integer.MIN_VALUE || (kryVar = this.e) == null || kryVar.d.ar != 8) ? this.f : i;
    }

    public final kry c() {
        int i = this.i - 1;
        if (i == 1) {
            return this.d.V;
        }
        if (i == 2) {
            return this.d.W;
        }
        if (i == 3) {
            return this.d.T;
        }
        if (i != 4) {
            return null;
        }
        return this.d.U;
    }

    public final void d(int i, ArrayList arrayList, ksz kszVar) {
        HashSet hashSet = this.a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                kss.a(((kry) it.next()).d, i, arrayList, kszVar);
            }
        }
    }

    public final void e() {
        HashSet hashSet;
        kry kryVar = this.e;
        if (kryVar != null && (hashSet = kryVar.a) != null) {
            hashSet.remove(this);
            if (this.e.a.size() == 0) {
                this.e.a = null;
            }
        }
        this.a = null;
        this.e = null;
        this.f = 0;
        this.g = Integer.MIN_VALUE;
        this.c = false;
        this.b = 0;
    }

    public final void f(int i) {
        this.b = i;
        this.c = true;
    }

    public final void g(int i) {
        if (j()) {
            this.g = i;
        }
    }

    public final boolean h() {
        HashSet hashSet = this.a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((kry) it.next()).c().j()) {
                return true;
            }
        }
        return false;
    }

    public final boolean i() {
        HashSet hashSet = this.a;
        return hashSet != null && hashSet.size() > 0;
    }

    public final boolean j() {
        return this.e != null;
    }

    public final boolean k(kry kryVar) {
        if (kryVar == null) {
            return false;
        }
        int i = this.i;
        int i2 = kryVar.i;
        if (i2 == i) {
            return i != 6 || (kryVar.d.P && this.d.P);
        }
        int i3 = 9;
        int i4 = 4;
        int i5 = 2;
        switch (i - 1) {
            case 1:
            case 3:
                i3 = 8;
                break;
            case 2:
            case 4:
                i5 = 3;
                i4 = 5;
                break;
            case 5:
                return (i2 == 2 || i2 == 4) ? false : true;
            case 6:
                return (i2 == 6 || i2 == 8 || i2 == 9) ? false : true;
            default:
                return false;
        }
        boolean z = i2 == i5 || i2 == i4;
        return kryVar.d instanceof ksd ? z || i2 == i3 : z;
    }

    public final void l(kry kryVar, int i) {
        n(kryVar, i, Integer.MIN_VALUE, false);
    }

    public final void m() {
        kqj kqjVar = this.h;
        if (kqjVar == null) {
            this.h = new kqj(1);
        } else {
            kqjVar.c();
        }
    }

    public final void n(kry kryVar, int i, int i2, boolean z) {
        if (kryVar == null) {
            e();
            return;
        }
        if (z || k(kryVar)) {
            this.e = kryVar;
            if (kryVar.a == null) {
                kryVar.a = new HashSet();
            }
            HashSet hashSet = this.e.a;
            if (hashSet != null) {
                hashSet.add(this);
            }
            this.f = i;
            this.g = i2;
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.as);
        sb.append(":");
        switch (this.i) {
            case 2:
                str = GeneralPurposeRichCardLayoutInfo.IMAGE_ALIGNMENT_LEFT;
                break;
            case 3:
                str = "TOP";
                break;
            case 4:
                str = GeneralPurposeRichCardLayoutInfo.IMAGE_ALIGNMENT_RIGHT;
                break;
            case 5:
                str = "BOTTOM";
                break;
            case 6:
                str = "BASELINE";
                break;
            case 7:
                str = "CENTER";
                break;
            case 8:
                str = "CENTER_X";
                break;
            default:
                str = "CENTER_Y";
                break;
        }
        sb.append(str);
        return sb.toString();
    }
}
