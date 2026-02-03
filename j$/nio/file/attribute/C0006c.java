package j$.nio.file.attribute;

import java.io.IOException;
import java.nio.file.attribute.BasicFileAttributeView;

/* renamed from: j$.nio.file.attribute.c, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class C0006c implements InterfaceC0008e {
    public final /* synthetic */ BasicFileAttributeView a;

    @Override // j$.nio.file.attribute.InterfaceC0008e
    public final /* synthetic */ void a(w wVar, w wVar2, w wVar3) throws IOException {
        this.a.setTimes(j$.desugar.sun.nio.fs.g.E(wVar), j$.desugar.sun.nio.fs.g.E(wVar2), j$.desugar.sun.nio.fs.g.E(wVar3));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        BasicFileAttributeView basicFileAttributeView = this.a;
        if (obj instanceof C0006c) {
            obj = ((C0006c) obj).a;
        }
        return basicFileAttributeView.equals(obj);
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
