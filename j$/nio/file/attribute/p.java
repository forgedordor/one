package j$.nio.file.attribute;

import java.nio.file.attribute.FileAttributeView;

/* loaded from: classes9.dex */
public final /* synthetic */ class p implements FileAttributeView {
    public final /* synthetic */ q a;

    public final /* synthetic */ boolean equals(Object obj) {
        q qVar = this.a;
        if (obj instanceof p) {
            obj = ((p) obj).a;
        }
        return qVar.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.attribute.AttributeView
    public final /* synthetic */ String name() {
        return this.a.name();
    }
}
