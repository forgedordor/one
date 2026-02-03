package defpackage;

import android.os.Parcel;
import io.grpc.Status;
import io.grpc.StatusException;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes6.dex */
abstract class fbwp {
    private boolean a;
    private InputStream b;
    private Queue c;
    public final fbvm d;
    public final int e;
    public final fcmm f;
    private boolean g;
    private int h;
    private int i;
    private int j;
    private int k = 1;

    public fbwp(fbvm fbvmVar, int i, fcmm fcmmVar) {
        this.d = fbvmVar;
        this.e = i;
        this.f = fcmmVar;
    }

    private final void c(int i) {
        int i2 = this.k;
        int i3 = i - 1;
        if (i3 == 1) {
            ejwl.l(i2 == 1);
        } else if (i3 == 2) {
            ejwl.l(i2 == 2);
        } else if (i3 == 3) {
            ejwl.l(i2 == 3);
        }
        this.k = i;
    }

    protected abstract int a(Parcel parcel);

    protected abstract int b(Parcel parcel);

    final void d(InputStream inputStream) {
        e();
        Queue queue = this.c;
        if (queue != null) {
            queue.add(inputStream);
        } else {
            if (this.b == null) {
                this.b = inputStream;
                return;
            }
            ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
            this.c = concurrentLinkedQueue;
            concurrentLinkedQueue.add(inputStream);
        }
    }

    protected final void e() {
        this.a = true;
    }

    protected final void f() {
        this.g = true;
    }

    final void g() throws StatusException {
        int iA;
        int i;
        while (true) {
            int i2 = this.k;
            int i3 = i2 - 1;
            InputStream inputStream = null;
            if (i2 == 0) {
                throw null;
            }
            boolean z = true;
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 != 2 || !this.g) {
                        return;
                    }
                } else if (!i() && !this.g) {
                    return;
                }
            } else if (!this.a) {
                return;
            }
            if (!h()) {
                return;
            }
            try {
                try {
                    fbwq fbwqVarC = fbwq.c();
                    try {
                        int i4 = 0;
                        fbwqVarC.a().writeInt(0);
                        Parcel parcelA = fbwqVarC.a();
                        int i5 = this.h;
                        this.h = i5 + 1;
                        parcelA.writeInt(i5);
                        int i6 = this.k;
                        int i7 = i6 - 1;
                        if (i6 == 0) {
                            throw null;
                        }
                        if (i7 == 0) {
                            iA = a(fbwqVarC.a()) | 1;
                            c(2);
                            if (i() || this.g) {
                            }
                            fbxg.c(fbwqVarC.a(), iA);
                            int iDataSize = fbwqVarC.a().dataSize();
                            this.d.t(this.e, fbwqVarC);
                            fcmm fcmmVar = this.f;
                            fcmmVar.c(iDataSize);
                            fcmmVar.k();
                            fbwqVarC.close();
                        } else if (i7 == 1) {
                            iA = 0;
                        } else {
                            if (i7 != 2) {
                                throw new AssertionError();
                            }
                            iA = i4 | 4 | b(fbwqVarC.a());
                            c(4);
                            fbxg.c(fbwqVarC.a(), iA);
                            int iDataSize2 = fbwqVarC.a().dataSize();
                            this.d.t(this.e, fbwqVarC);
                            fcmm fcmmVar2 = this.f;
                            fcmmVar2.c(iDataSize2);
                            fcmmVar2.k();
                            fbwqVarC.close();
                        }
                        if (this.i == 0) {
                            inputStream = this.b;
                        } else {
                            Queue queue = this.c;
                            if (queue != null) {
                                inputStream = (InputStream) queue.peek();
                            }
                        }
                        if (inputStream != null) {
                            int i8 = iA | 2;
                            Parcel parcelA2 = fbwqVarC.a();
                            if (inputStream instanceof fbwr) {
                                this.j = ((fbwr) inputStream).a(parcelA2);
                                i = 64;
                                z = false;
                            } else {
                                byte[] bArrB = fbvu.b();
                                try {
                                    int i9 = inputStream.read(bArrB);
                                    if (i9 <= 0) {
                                        parcelA2.writeInt(0);
                                    } else {
                                        parcelA2.writeInt(i9);
                                        parcelA2.writeByteArray(bArrB, 0, i9);
                                        this.j += i9;
                                        if (i9 == bArrB.length) {
                                            i = 128;
                                        }
                                    }
                                    z = false;
                                    i = 0;
                                } finally {
                                    fbvu.a(bArrB);
                                }
                            }
                            if (!z) {
                                inputStream.close();
                                int i10 = this.i;
                                this.i = i10 + 1;
                                if (i10 > 0) {
                                    Queue queue2 = this.c;
                                    queue2.getClass();
                                    queue2.poll();
                                }
                                fcmm fcmmVar3 = this.f;
                                fcmmVar3.i();
                                fcmmVar3.j();
                                this.j = 0;
                            }
                            i4 = i8 | i;
                        } else {
                            ejwl.l(this.g);
                            i4 = iA;
                        }
                        if (!this.g || i()) {
                            iA = i4;
                            fbxg.c(fbwqVarC.a(), iA);
                            int iDataSize22 = fbwqVarC.a().dataSize();
                            this.d.t(this.e, fbwqVarC);
                            fcmm fcmmVar22 = this.f;
                            fcmmVar22.c(iDataSize22);
                            fcmmVar22.k();
                            fbwqVarC.close();
                        } else {
                            c(3);
                            iA = i4 | 4 | b(fbwqVarC.a());
                            c(4);
                            fbxg.c(fbwqVarC.a(), iA);
                            int iDataSize222 = fbwqVarC.a().dataSize();
                            this.d.t(this.e, fbwqVarC);
                            fcmm fcmmVar222 = this.f;
                            fcmmVar222.c(iDataSize222);
                            fcmmVar222.k();
                            fbwqVarC.close();
                        }
                    } catch (Throwable th) {
                        try {
                            fbwqVarC.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (StatusException e) {
                    c(5);
                    throw e;
                }
            } catch (IOException e2) {
                throw Status.o.d(e2).asException();
            }
        }
    }

    final boolean h() {
        return this.d.w();
    }

    protected final boolean i() {
        Queue queue = this.c;
        return queue != null ? !queue.isEmpty() : this.b != null && this.i == 0;
    }

    public final synchronized String toString() {
        String simpleName;
        int i;
        simpleName = getClass().getSimpleName();
        i = this.k;
        return simpleName + "[S=" + (i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "CLOSED" : "SUFFIX_SENT" : "ALL_MESSAGES_SENT" : "PREFIX_SENT" : "INITIAL") + "/NDM=" + this.i + "]";
    }
}
