package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.GeneralPurposeRichCardLayoutInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ksp implements ksn {
    final kta d;
    int e;
    public int f;
    public ksn a = null;
    public boolean b = false;
    public boolean c = false;
    int l = 1;
    int g = 1;
    ksq h = null;
    public boolean i = false;
    final List j = new ArrayList();
    final List k = new ArrayList();

    public ksp(kta ktaVar) {
        this.d = ktaVar;
    }

    public final void a(ksn ksnVar) {
        this.j.add(ksnVar);
        if (this.i) {
            ksnVar.f();
        }
    }

    public final void b() {
        this.k.clear();
        this.j.clear();
        this.i = false;
        this.f = 0;
        this.c = false;
        this.b = false;
    }

    public void c(int i) {
        if (this.i) {
            return;
        }
        this.i = true;
        this.f = i;
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            ((ksn) it.next()).f();
        }
    }

    @Override // defpackage.ksn
    public final void f() {
        List<ksp> list = this.k;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!((ksp) it.next()).i) {
                return;
            }
        }
        this.c = true;
        ksn ksnVar = this.a;
        if (ksnVar != null) {
            ksnVar.f();
        }
        if (this.b) {
            this.d.f();
            return;
        }
        int i = 0;
        ksp kspVar = null;
        for (ksp kspVar2 : list) {
            if (!(kspVar2 instanceof ksq)) {
                i++;
                kspVar = kspVar2;
            }
        }
        if (kspVar != null && i == 1 && kspVar.i) {
            ksq ksqVar = this.h;
            if (ksqVar != null) {
                if (!ksqVar.i) {
                    return;
                } else {
                    this.e = this.g * ksqVar.f;
                }
            }
            c(kspVar.f + this.e);
        }
        ksn ksnVar2 = this.a;
        if (ksnVar2 != null) {
            ksnVar2.f();
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.d.as);
        sb.append(":");
        switch (this.l) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "HORIZONTAL_DIMENSION";
                break;
            case 3:
                str = "VERTICAL_DIMENSION";
                break;
            case 4:
                str = GeneralPurposeRichCardLayoutInfo.IMAGE_ALIGNMENT_LEFT;
                break;
            case 5:
                str = GeneralPurposeRichCardLayoutInfo.IMAGE_ALIGNMENT_RIGHT;
                break;
            case 6:
                str = "TOP";
                break;
            case 7:
                str = "BOTTOM";
                break;
            case 8:
                str = "BASELINE";
                break;
            default:
                str = "null";
                break;
        }
        sb.append((Object) str);
        sb.append("(");
        sb.append(this.i ? Integer.valueOf(this.f) : "unresolved");
        sb.append(") <t=");
        sb.append(this.k.size());
        sb.append(":d=");
        sb.append(this.j.size());
        sb.append(">");
        return sb.toString();
    }
}
