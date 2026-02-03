package defpackage;

import io.grpc.Status;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.Locale;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fbzj implements fcmn {
    public static final Logger t = Logger.getLogger(fbzj.class.getName());

    @Override // defpackage.fcmn
    public final void d() {
        fchu fchuVar;
        fcmv fcmvVar;
        if (((fchu) u()).i || (fcmvVar = (fchuVar = (fchu) u()).b) == null || fcmvVar.a() <= 0) {
            return;
        }
        fchuVar.b(false, true);
    }

    @Override // defpackage.fcmn
    public final void f() {
        fbzi fbziVarR = r();
        fchq fchqVar = fbziVarR.r;
        fchqVar.a = fbziVarR;
        fbziVarR.o = fchqVar;
    }

    @Override // defpackage.fcmn
    public final void g(int i) {
        fbzi fbziVarR = r();
        fcbg fcbgVar = fbziVarR.o;
        int i2 = fcsr.a;
        fbziVarR.e(new fbzh(fbziVarR, i));
    }

    @Override // defpackage.fcmn
    public final void h(fbnr fbnrVar) {
        fcdp fcdpVarU = u();
        fbnrVar.getClass();
        ((fchu) fcdpVarU).d = fbnrVar;
    }

    @Override // defpackage.fcmn
    public final void n(InputStream inputStream) throws IOException {
        int iA;
        try {
            if (!((fchu) u()).i) {
                fcdp fcdpVarU = u();
                if (((fchu) fcdpVarU).i) {
                    throw new IllegalStateException("Framer already closed");
                }
                ((fchu) fcdpVarU).j++;
                ((fchu) fcdpVarU).k++;
                ((fchu) fcdpVarU).l = 0L;
                ((fchu) fcdpVarU).h.i();
                fbnr fbnrVar = ((fchu) fcdpVarU).d;
                fbnq fbnqVar = fbnp.a;
                try {
                    try {
                        try {
                            int iAvailable = inputStream.available();
                            if (iAvailable != 0 && fbnrVar != fbnqVar) {
                                fchr fchrVar = new fchr((fchu) fcdpVarU);
                                OutputStream outputStreamB = ((fchu) fcdpVarU).d.b(fchrVar);
                                try {
                                    iA = fchu.a(inputStream, outputStreamB);
                                    outputStreamB.close();
                                    int i = ((fchu) fcdpVarU).a;
                                    if (i >= 0 && iA > i) {
                                        throw new fbtf(Status.k.withDescription(String.format(Locale.US, "message too large %d > %d", Integer.valueOf(iA), Integer.valueOf(((fchu) fcdpVarU).a))));
                                    }
                                    ((fchu) fcdpVarU).c(fchrVar, true);
                                } catch (Throwable th) {
                                    outputStreamB.close();
                                    throw th;
                                }
                            } else if (iAvailable != -1) {
                                ((fchu) fcdpVarU).l = iAvailable;
                                int i2 = ((fchu) fcdpVarU).a;
                                if (i2 >= 0 && iAvailable > i2) {
                                    throw new fbtf(Status.k.withDescription(String.format(Locale.US, "message too large %d > %d", Integer.valueOf(iAvailable), Integer.valueOf(((fchu) fcdpVarU).a))));
                                }
                                ByteBuffer byteBuffer = ((fchu) fcdpVarU).f;
                                byteBuffer.clear();
                                byteBuffer.put((byte) 0).putInt(iAvailable);
                                ((fchu) fcdpVarU).c = iAvailable + 5;
                                ((fchu) fcdpVarU).d(byteBuffer.array(), 0, byteBuffer.position());
                                iA = fchu.a(inputStream, ((fchu) fcdpVarU).e);
                            } else {
                                fchr fchrVar2 = new fchr((fchu) fcdpVarU);
                                iA = fchu.a(inputStream, fchrVar2);
                                ((fchu) fcdpVarU).c(fchrVar2, false);
                            }
                            if (iAvailable != -1 && iA != iAvailable) {
                                throw new fbtf(Status.o.withDescription(String.format("Message length inaccurate %s != %s", Integer.valueOf(iA), Integer.valueOf(iAvailable))));
                            }
                            fcmm fcmmVar = ((fchu) fcdpVarU).h;
                            fcmmVar.k();
                            fcmmVar.c(((fchu) fcdpVarU).l);
                            fcmmVar.j();
                        } catch (IOException e) {
                            throw new fbtf(Status.o.withDescription("Failed to frame message").d(e));
                        }
                    } catch (RuntimeException e2) {
                        throw new fbtf(Status.o.withDescription("Failed to frame message").d(e2));
                    }
                } catch (fbtf e3) {
                    throw e3;
                }
            }
        } finally {
            fcdy.h(inputStream);
        }
    }

    @Override // defpackage.fcmn
    public boolean o() {
        throw null;
    }

    protected abstract fbzi r();

    protected abstract fcdp u();

    public final void w(int i) {
        fbzi fbziVarR = r();
        synchronized (fbziVarR.p) {
            fbziVarR.s += i;
        }
    }
}
