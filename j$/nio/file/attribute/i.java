package j$.nio.file.attribute;

import java.io.IOException;
import java.nio.file.attribute.DosFileAttributeView;

/* loaded from: classes9.dex */
public final /* synthetic */ class i implements InterfaceC0008e {
    public final /* synthetic */ DosFileAttributeView a;

    @Override // j$.nio.file.attribute.InterfaceC0008e
    public final /* synthetic */ void a(w wVar, w wVar2, w wVar3) throws IOException {
        this.a.setTimes(j$.desugar.sun.nio.fs.g.E(wVar), j$.desugar.sun.nio.fs.g.E(wVar2), j$.desugar.sun.nio.fs.g.E(wVar3));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        DosFileAttributeView dosFileAttributeView = this.a;
        if (obj instanceof i) {
            obj = ((i) obj).a;
        }
        return dosFileAttributeView.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.nio.file.attribute.q
    public final /* synthetic */ String name() {
        return this.a.name();
    }

    @Override // j$.nio.file.attribute.InterfaceC0008e
    public final /* synthetic */ h readAttributes() {
        return C0009f.a(this.a.readAttributes());
    }
}
