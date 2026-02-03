package defpackage;

import java.io.IOException;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cohd {
    public static final Object a(String str, Supplier supplier) throws IOException {
        eieu eieuVarA = eiiy.a(str);
        try {
            Object obj = supplier.get();
            fczl.a(eieuVarA, null);
            return obj;
        } finally {
        }
    }

    public static final void b(String str, Runnable runnable) throws IOException {
        eieu eieuVarA = eiiy.a(str);
        try {
            runnable.run();
            fczl.a(eieuVarA, null);
        } finally {
        }
    }
}
