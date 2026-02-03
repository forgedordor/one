package defpackage;

import androidx.car.app.model.Alert;
import io.grpc.Status;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcrh implements fbri {
    private static final ThreadLocal b = new ThreadLocal();
    public final evuh a;
    private final evuo c;

    public fcrh(evuh evuhVar) {
        evuhVar.getClass();
        this.a = evuhVar;
        this.c = evuhVar.getParserForType();
    }

    @Override // defpackage.fbri
    public final /* bridge */ /* synthetic */ InputStream a(Object obj) {
        return new fcrg((evuh) obj, this.c);
    }

    @Override // defpackage.fbri
    public final /* synthetic */ Object b(InputStream inputStream) throws IOException {
        byte[] bArr;
        if (inputStream instanceof fcrg) {
            fcrg fcrgVar = (fcrg) inputStream;
            if (fcrgVar.b == this.c) {
                try {
                    evuh evuhVar = fcrgVar.a;
                    if (evuhVar != null) {
                        return evuhVar;
                    }
                    throw new IllegalStateException("message not available");
                } catch (IllegalStateException unused) {
                }
            }
        }
        try {
            evqz evqzVarK = null;
            if (inputStream instanceof fbpu) {
                int iAvailable = inputStream.available();
                if (iAvailable > 0 && iAvailable <= 4194304) {
                    ThreadLocal threadLocal = b;
                    Reference reference = (Reference) threadLocal.get();
                    if (reference == null || (bArr = (byte[]) reference.get()) == null || bArr.length < iAvailable) {
                        bArr = new byte[iAvailable];
                        threadLocal.set(new WeakReference(bArr));
                    }
                    int i = iAvailable;
                    while (i > 0) {
                        int i2 = inputStream.read(bArr, iAvailable - i, i);
                        if (i2 == -1) {
                            break;
                        }
                        i -= i2;
                    }
                    if (i != 0) {
                        throw new RuntimeException("size inaccurate: " + iAvailable + " != " + (iAvailable - i));
                    }
                    evqzVarK = evqz.R(bArr, 0, iAvailable);
                } else if (iAvailable == 0) {
                    return this.a;
                }
            }
            if (evqzVarK == null) {
                evqzVarK = evqz.K(inputStream);
            }
            evqzVarK.e = Alert.DURATION_SHOW_INDEFINITELY;
            try {
                Object objJ = this.c.j(evqzVarK, fcrj.a);
                try {
                    evqzVarK.z(0);
                    return objJ;
                } catch (evtj e) {
                    throw e;
                }
            } catch (evtj e2) {
                throw new fbtf(Status.o.withDescription("Invalid protobuf byte sequence").d(e2));
            }
        } catch (IOException e3) {
            throw new RuntimeException(e3);
        }
    }
}
