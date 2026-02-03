package defpackage;

import android.graphics.Rect;
import android.util.Size;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bun extends buy {
    public final int a;
    public final int b;
    public final Rect c;
    public final Size d;
    public final int e;
    public final boolean f;
    private final UUID g;
    private final boolean h;

    public bun(UUID uuid, int i, int i2, Rect rect, Size size, int i3, boolean z, boolean z2) {
        if (uuid == null) {
            throw new NullPointerException("Null getUuid");
        }
        this.g = uuid;
        this.a = i;
        this.b = i2;
        if (rect == null) {
            throw new NullPointerException("Null getCropRect");
        }
        this.c = rect;
        if (size == null) {
            throw new NullPointerException("Null getSize");
        }
        this.d = size;
        this.e = i3;
        this.f = z;
        this.h = z2;
    }

    @Override // defpackage.buy
    public final int a() {
        return this.b;
    }

    @Override // defpackage.buy
    public final int b() {
        return this.e;
    }

    @Override // defpackage.buy
    public final int c() {
        return this.a;
    }

    @Override // defpackage.buy
    public final Rect d() {
        return this.c;
    }

    @Override // defpackage.buy
    public final Size e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof buy) {
            buy buyVar = (buy) obj;
            if (this.g.equals(buyVar.f()) && this.a == buyVar.c() && this.b == buyVar.a() && this.c.equals(buyVar.d()) && this.d.equals(buyVar.e()) && this.e == buyVar.b() && this.f == buyVar.g() && this.h == buyVar.h()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.buy
    public final UUID f() {
        return this.g;
    }

    @Override // defpackage.buy
    public final boolean g() {
        return this.f;
    }

    @Override // defpackage.buy
    public final boolean h() {
        return this.h;
    }

    public final int hashCode() {
        return ((((((((((((((this.g.hashCode() ^ 1000003) * 1000003) ^ this.a) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ (true == this.h ? 1231 : 1237);
    }

    public final String toString() {
        return "OutConfig{getUuid=" + this.g + ", getTargets=" + this.a + ", getFormat=" + this.b + ", getCropRect=" + this.c + ", getSize=" + this.d + ", getRotationDegrees=" + this.e + ", isMirroring=" + this.f + ", shouldRespectInputCropRect=" + this.h + "}";
    }
}
