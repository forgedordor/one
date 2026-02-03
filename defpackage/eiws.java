package defpackage;

import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eiws extends eixm {
    private final Optional a;
    private final Optional b;
    private final Optional c;
    private final List d;
    private final Optional e;
    private final Optional f;
    private final Optional g;

    public eiws(Optional optional, Optional optional2, Optional optional3, List list, Optional optional4, Optional optional5, Optional optional6) {
        this.a = optional;
        this.b = optional2;
        this.c = optional3;
        this.d = list;
        this.e = optional4;
        this.f = optional5;
        this.g = optional6;
    }

    @Override // defpackage.eixm
    public final Optional a() {
        return this.c;
    }

    @Override // defpackage.eiyb
    public final Optional b() {
        return this.a;
    }

    @Override // defpackage.eiyb
    public final Optional c() {
        return this.b;
    }

    @Override // defpackage.eixm
    public final Optional d() {
        return this.g;
    }

    @Override // defpackage.eixm
    public final Optional e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eixm) {
            eixm eixmVar = (eixm) obj;
            if (this.a.equals(eixmVar.b()) && this.b.equals(eixmVar.c()) && this.c.equals(eixmVar.a()) && this.d.equals(eixmVar.g()) && this.e.equals(eixmVar.e()) && this.f.equals(eixmVar.f()) && this.g.equals(eixmVar.d())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.eixm
    public final Optional f() {
        return this.f;
    }

    @Override // defpackage.eixm
    public final List g() {
        return this.d;
    }

    public final int hashCode() {
        return ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode();
    }

    public final String toString() {
        Optional optional = this.g;
        Optional optional2 = this.f;
        Optional optional3 = this.e;
        List list = this.d;
        Optional optional4 = this.c;
        Optional optional5 = this.b;
        return "Order{id=" + String.valueOf(this.a) + ", name=" + String.valueOf(optional5) + ", orderDate=" + String.valueOf(optional4) + ", orderedItems=" + list.toString() + ", orderStatus=" + String.valueOf(optional3) + ", seller=" + String.valueOf(optional2) + ", orderDelivery=" + String.valueOf(optional) + "}";
    }
}
