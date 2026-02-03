package j$.nio.file.attribute;

import java.nio.file.attribute.FileAttribute;

/* loaded from: classes9.dex */
public final /* synthetic */ class k implements m {
    public final /* synthetic */ FileAttribute a;

    public /* synthetic */ k(FileAttribute fileAttribute) {
        this.a = fileAttribute;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        FileAttribute fileAttribute = this.a;
        if (obj instanceof k) {
            obj = ((k) obj).a;
        }
        return fileAttribute.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.nio.file.attribute.m
    public final /* synthetic */ String name() {
        return this.a.name();
    }

    @Override // j$.nio.file.attribute.m
    public final /* synthetic */ Object value() {
        return this.a.value();
    }
}
