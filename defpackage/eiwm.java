package defpackage;

import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eiwm extends eixg {
    private final Optional a;
    private final Optional b;
    private final Optional c;
    private final Optional d;
    private final List e;

    public eiwm(Optional optional, Optional optional2, Optional optional3, Optional optional4, List list) {
        this.a = optional;
        this.b = optional2;
        this.c = optional3;
        this.d = optional4;
        this.e = list;
    }

    @Override // defpackage.eixg
    public final Optional a() {
        return this.d;
    }

    @Override // defpackage.eiyb
    public final Optional b() {
        return this.a;
    }

    @Override // defpackage.eiyb
    public final Optional c() {
        return this.b;
    }

    @Override // defpackage.eixg
    public final Optional d() {
        return this.c;
    }

    @Override // defpackage.eixg
    public final List e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eixg) {
            eixg eixgVar = (eixg) obj;
            if (this.a.equals(eixgVar.b()) && this.b.equals(eixgVar.c()) && this.c.equals(eixgVar.d()) && this.d.equals(eixgVar.a()) && this.e.equals(eixgVar.e())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        List list = this.e;
        Optional optional = this.d;
        Optional optional2 = this.c;
        Optional optional3 = this.b;
        return "CalendarEvent{id=" + String.valueOf(this.a) + ", name=" + String.valueOf(optional3) + ", startDate=" + String.valueOf(optional2) + ", endDate=" + String.valueOf(optional) + ", attendeeList=" + list.toString() + "}";
    }
}
