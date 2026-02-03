package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class okl extends okp {
    private final Class r;

    public okl(Class cls) {
        super(cls, null);
        if (cls.isEnum()) {
            this.r = cls;
        } else {
            Objects.toString(cls);
            throw new IllegalArgumentException(cls.toString().concat(" is not an Enum type."));
        }
    }

    @Override // defpackage.okp, defpackage.okq
    public final String e() {
        String name = this.r.getName();
        name.getClass();
        return name;
    }

    @Override // defpackage.okp, defpackage.okq
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Enum c(String str) {
        Object obj;
        str.getClass();
        Class cls = this.r;
        Object[] enumConstants = cls.getEnumConstants();
        enumConstants.getClass();
        int i = 0;
        while (true) {
            if (i >= enumConstants.length) {
                obj = null;
                break;
            }
            obj = enumConstants[i];
            if (fdgn.j(((Enum) obj).name(), str, true)) {
                break;
            }
            i++;
        }
        Enum r3 = (Enum) obj;
        if (r3 != null) {
            return r3;
        }
        throw new IllegalArgumentException("Enum value " + str + " not found for type " + cls.getName() + '.');
    }
}
