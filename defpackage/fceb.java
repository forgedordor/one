package defpackage;

import io.grpc.Status;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fceb extends fbze {
    private static final fbpo a;
    private static final fbrb b;
    private Status c;
    private fbrg d;
    private Charset e;
    private boolean f;

    static {
        fcea fceaVar = new fcea();
        a = fceaVar;
        b = fbpp.a(":status", fceaVar);
    }

    protected fceb(int i, fcmm fcmmVar, fcmu fcmuVar) {
        super(i, fcmmVar, fcmuVar);
        this.e = StandardCharsets.UTF_8;
    }

    private static Charset f(fbrg fbrgVar) {
        String str = (String) fbrgVar.c(fcdy.h);
        if (str != null) {
            try {
                return Charset.forName(str.split("charset=", 2)[r2.length - 1].trim());
            } catch (Exception unused) {
            }
        }
        return StandardCharsets.UTF_8;
    }

    private static void r(fbrg fbrgVar) {
        fbrgVar.f(b);
        fbrgVar.f(fbpr.b);
        fbrgVar.f(fbpr.a);
    }

    private static final Status s(fbrg fbrgVar) {
        char cCharAt;
        Integer num = (Integer) fbrgVar.c(b);
        if (num == null) {
            return Status.o.withDescription("Missing HTTP status code");
        }
        String str = (String) fbrgVar.c(fcdy.h);
        if (str != null && str.length() >= 16) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (lowerCase.startsWith("application/grpc") && (lowerCase.length() == 16 || (cCharAt = lowerCase.charAt(16)) == '+' || cCharAt == ';')) {
                return null;
            }
        }
        return fcdy.a(num.intValue()).b("invalid content-type: ".concat(String.valueOf(str)));
    }

    protected abstract void c(Status status, boolean z, fbrg fbrgVar);

    protected final void o(fcix fcixVar, boolean z) {
        Status status = this.c;
        boolean z2 = false;
        if (status != null) {
            Charset charset = this.e;
            fcix fcixVar2 = fcjb.a;
            charset.getClass();
            int iF = fcixVar.f();
            byte[] bArr = new byte[iF];
            fcixVar.k(bArr, 0, iF);
            this.c = status.b("DATA-----------------------------\n".concat(new String(bArr, charset)));
            fcixVar.close();
            if (this.c.getDescription().length() > 1000 || z) {
                c(this.c, false, this.d);
                return;
            }
            return;
        }
        if (!this.f) {
            fcixVar.close();
            c(Status.o.withDescription("headers not received before payload"), false, new fbrg());
            return;
        }
        int iF2 = fcixVar.f();
        boolean z3 = true;
        try {
            if (this.n) {
                fbzf.q.logp(Level.INFO, "io.grpc.internal.AbstractClientStream$TransportState", "inboundDataReceived", "Received data on closed stream");
                fcixVar.close();
            } else {
                try {
                    fcbg fcbgVar = this.o;
                    try {
                        if (((fchq) fcbgVar).b() || ((fchq) fcbgVar).f) {
                            fcixVar.close();
                        } else {
                            ((fchq) fcbgVar).d.h(fcixVar);
                            try {
                                ((fchq) fcbgVar).a();
                            } catch (Throwable th) {
                                th = th;
                                z3 = false;
                                if (z3) {
                                    fcixVar.close();
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    try {
                        b(th3);
                    } catch (Throwable th4) {
                        th = th4;
                        if (z2) {
                            fcixVar.close();
                        }
                        throw th;
                    }
                }
            }
            if (z) {
                if (iF2 > 0) {
                    this.c = Status.o.withDescription("Received unexpected EOS on non-empty DATA frame from server");
                } else {
                    this.c = Status.o.withDescription("Received unexpected EOS on empty DATA frame from server");
                }
                fbrg fbrgVar = new fbrg();
                this.d = fbrgVar;
                j(this.c, false, fbrgVar);
            }
        } catch (Throwable th5) {
            th = th5;
            z2 = true;
        }
    }

    public final void p(fbrg fbrgVar) {
        Status status = this.c;
        if (status != null) {
            this.c = status.b("headers: ".concat(fbrgVar.toString()));
            return;
        }
        try {
            if (this.f) {
                this.c = Status.o.withDescription("Received headers twice");
            } else {
                Integer num = (Integer) fbrgVar.c(b);
                if (num == null || num.intValue() < 100 || num.intValue() >= 200) {
                    this.f = true;
                    Status statusS = s(fbrgVar);
                    this.c = statusS;
                    if (statusS != null) {
                        this.c = statusS.b("headers: ".concat(fbrgVar.toString()));
                        this.d = fbrgVar;
                        this.e = f(fbrgVar);
                        return;
                    }
                    r(fbrgVar);
                    ejwl.m(!this.n, "Received headers on closed stream");
                    this.j.d();
                    String str = (String) fbrgVar.c(fcdy.c);
                    if (str == null) {
                        this.k.c(fbrgVar);
                    } else {
                        fbom fbomVarA = this.l.a(str);
                        if (fbomVarA == null) {
                            b(new fbtf(Status.o.withDescription(String.format("Can't find decompressor for %s", str))));
                        } else {
                            if (fbomVarA != fbnp.a) {
                                fcbg fcbgVar = this.o;
                                ejwl.m(true, "Already set full stream decompressor");
                                ((fchq) fcbgVar).c = fbomVarA;
                            }
                            this.k.c(fbrgVar);
                        }
                    }
                }
            }
            Status status2 = this.c;
            if (status2 != null) {
                this.c = status2.b("headers: ".concat(fbrgVar.toString()));
                this.d = fbrgVar;
                this.e = f(fbrgVar);
            }
        } catch (Throwable th) {
            Status status3 = this.c;
            if (status3 != null) {
                this.c = status3.b("headers: ".concat(fbrgVar.toString()));
                this.d = fbrgVar;
                this.e = f(fbrgVar);
            }
            throw th;
        }
    }

    public final void q(fbrg fbrgVar) {
        Status statusB;
        Status statusS = this.c;
        if (statusS == null && !this.f) {
            statusS = s(fbrgVar);
            this.c = statusS;
            if (statusS != null) {
                this.d = fbrgVar;
            }
        }
        if (statusS != null) {
            Status statusB2 = statusS.b("trailers: ".concat(fbrgVar.toString()));
            this.c = statusB2;
            c(statusB2, false, this.d);
            return;
        }
        Status status = (Status) fbrgVar.c(fbpr.b);
        if (status != null) {
            statusB = status.withDescription((String) fbrgVar.c(fbpr.a));
        } else if (this.f) {
            statusB = Status.d.withDescription("missing GRPC status in response");
        } else {
            Integer num = (Integer) fbrgVar.c(b);
            statusB = (num != null ? fcdy.a(num.intValue()) : Status.o.withDescription("missing HTTP status code")).b("missing GRPC status, inferred error from HTTP status code");
        }
        r(fbrgVar);
        if (this.n) {
            fbzf.q.logp(Level.INFO, "io.grpc.internal.AbstractClientStream$TransportState", "inboundTrailersReceived", "Received trailers on closed stream:\n {1}\n {2}", new Object[]{statusB, fbrgVar});
        } else {
            this.j.e();
            j(statusB, false, fbrgVar);
        }
    }
}
