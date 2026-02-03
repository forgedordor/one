package defpackage;

import android.widget.photopicker.EmbeddedPhotoPickerProvider;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmvk implements dmvm {
    public final fdvc a;
    public final hox b;
    public final EmbeddedPhotoPickerProvider c;
    public final Executor d;
    public final fdap e;
    public final fdap f;
    public final fdap g;
    public final fdap h;
    private final fdpl i;

    public dmvk(fdpl fdplVar, fdvc fdvcVar, hox hoxVar, EmbeddedPhotoPickerProvider embeddedPhotoPickerProvider, Executor executor, fdap fdapVar, fdap fdapVar2, fdap fdapVar3, fdap fdapVar4) {
        embeddedPhotoPickerProvider.getClass();
        this.i = fdplVar;
        this.a = fdvcVar;
        this.b = hoxVar;
        this.c = embeddedPhotoPickerProvider;
        this.d = executor;
        this.e = fdapVar;
        this.f = fdapVar2;
        this.g = fdapVar3;
        this.h = fdapVar4;
    }

    @Override // defpackage.dmvm
    public final fdpl a() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmvk)) {
            return false;
        }
        dmvk dmvkVar = (dmvk) obj;
        return fdbq.f(this.i, dmvkVar.i) && fdbq.f(this.a, dmvkVar.a) && fdbq.f(this.b, dmvkVar.b) && fdbq.f(this.c, dmvkVar.c) && fdbq.f(this.d, dmvkVar.d) && fdbq.f(this.e, dmvkVar.e) && fdbq.f(this.f, dmvkVar.f) && fdbq.f(this.g, dmvkVar.g) && fdbq.f(this.h, dmvkVar.h);
    }

    public final int hashCode() {
        return (((((((((((((((this.i.hashCode() * 31) + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode();
    }

    public final String toString() {
        return "Embedded(titleFlow=" + this.i + ", selectedMedia=" + this.a + ", isExpanded=" + this.b + ", photoPickerProvider=" + this.c + ", clientCallbackExecutor=" + this.d + ", onSelected=" + this.e + ", onUnselected=" + this.f + ", onError=" + this.g + ", surfaceViewCreator=" + this.h + ")";
    }
}
