package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egqg implements Parcelable {
    public final int a;
    public boolean b;
    ejwi c;
    public Object d;
    public Object e;
    private Throwable g;
    private egqf h;
    private static final ekrg f = ekrg.c("com/google/apps/tiktok/concurrent/futuresmixin/ParcelableFuture");
    public static final Parcelable.Creator<egqg> CREATOR = new egqe();

    public egqg(int i, Object obj, ListenableFuture listenableFuture) {
        this.c = ejud.a;
        this.a = i;
        this.d = obj;
        eork.r(listenableFuture, eiid.h(new egqd(this)), eoqg.a);
    }

    private static void d(Object obj, Parcel parcel) {
        int iDataPosition = parcel.dataPosition();
        try {
            parcel.writeValue(obj);
        } catch (RuntimeException e) {
            parcel.setDataPosition(iDataPosition);
            ((ekrd) ((ekrd) ((ekrd) f.i()).g(e)).h("com/google/apps/tiktok/concurrent/futuresmixin/ParcelableFuture", "tryToWriteValue", (char) 238, "ParcelableFuture.java")).q("Result lost due to non-parcelable type.");
            throw new IllegalArgumentException("Type not supported by Parcel and will be dropped: ".concat(String.valueOf(String.valueOf(obj.getClass()))), e);
        }
    }

    public final void a() {
        egqf egqfVar = this.h;
        if (egqfVar != null) {
            final Throwable th = this.g;
            if (th != null) {
                final egqc egqcVar = (egqc) egqfVar;
                egqcVar.a.execute(eiid.k(new Runnable() { // from class: egqb
                    @Override // java.lang.Runnable
                    public final void run() {
                        Throwable th2 = th;
                        egqc egqcVar2 = egqcVar;
                        if (egqcVar2.e) {
                            egqg egqgVar = this;
                            if (egqcVar2.c.remove(egqgVar)) {
                                egps egpsVar = (egps) egqcVar2.b.b(egqgVar.a);
                                eieu eieuVarJ = eiiy.j("onFailure FuturesMixin", eiey.a);
                                try {
                                    egpsVar.f(egqgVar.d, th2);
                                    eieuVarJ.close();
                                } catch (Throwable th3) {
                                    try {
                                        eieuVarJ.close();
                                    } catch (Throwable th4) {
                                        th3.addSuppressed(th4);
                                    }
                                    throw th3;
                                }
                            }
                        }
                    }
                }));
            } else {
                final Object obj = this.e;
                final egqc egqcVar2 = (egqc) egqfVar;
                egqcVar2.a.execute(eiid.k(new Runnable() { // from class: egpz
                    @Override // java.lang.Runnable
                    public final void run() {
                        Object obj2 = obj;
                        egqc egqcVar3 = egqcVar2;
                        if (egqcVar3.e) {
                            egqg egqgVar = this;
                            if (egqcVar3.c.remove(egqgVar)) {
                                egps egpsVar = (egps) egqcVar3.b.b(egqgVar.a);
                                eieu eieuVarJ = eiiy.j("onSuccess FuturesMixin", eiey.a);
                                try {
                                    egpsVar.c(egqgVar.d, obj2);
                                    eieuVarJ.close();
                                } catch (Throwable th2) {
                                    try {
                                        eieuVarJ.close();
                                    } catch (Throwable th3) {
                                        th2.addSuppressed(th3);
                                    }
                                    throw th2;
                                }
                            }
                        }
                    }
                }));
            }
        }
    }

    final void b(Throwable th) {
        this.g = th;
        this.b = true;
        a();
    }

    final void c(egqf egqfVar) {
        this.h = egqfVar;
        if (egqfVar == null || !this.b) {
            return;
        }
        a();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String str;
        String str2;
        Object obj = this.d;
        String str3 = "";
        if (obj != null) {
            str = "input=" + obj.getClass().getName() + ";";
        } else {
            str = "";
        }
        Object obj2 = this.e;
        if (obj2 != null) {
            str2 = "result=" + obj2.getClass().getName() + ";";
        } else {
            str2 = "";
        }
        Throwable th = this.g;
        if (th != null) {
            str3 = "error=" + th.getClass().getName() + ";";
        }
        return "ParcelableFuture(" + str + str2 + str3 + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        try {
            d(this.d, parcel);
        } catch (RuntimeException e) {
            parcel.writeValue(null);
            this.b = true;
            this.g = new IllegalArgumentException("FuturesMixin input isn't Parcelable.", e);
            this.e = null;
        }
        parcel.writeInt(true != this.b ? 2 : 1);
        if (this.b) {
            try {
                d(this.e, parcel);
            } catch (RuntimeException e2) {
                parcel.writeValue(null);
                this.g = new IllegalArgumentException("FuturesMixin result isn't Parcelable.", e2);
            }
            try {
                d(this.g, parcel);
            } catch (RuntimeException e3) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("FuturesMixin result isn't Parcelable: ".concat(String.valueOf(String.valueOf(this.g))), e3);
                this.g = illegalArgumentException;
                d(illegalArgumentException, parcel);
            }
        }
    }

    public egqg(Parcel parcel) {
        this.c = ejud.a;
        ClassLoader classLoader = getClass().getClassLoader();
        this.a = parcel.readInt();
        try {
            this.d = parcel.readValue(classLoader);
            int i = parcel.readInt();
            this.c = ejwi.j(Integer.valueOf(i));
            if (i == 1) {
                this.b = true;
                this.e = parcel.readValue(classLoader);
                this.g = (Throwable) parcel.readValue(classLoader);
            }
        } catch (RuntimeException e) {
            ((ekrd) ((ekrd) ((ekrd) f.i()).g(e)).h("com/google/apps/tiktok/concurrent/futuresmixin/ParcelableFuture", "<init>", 95, "ParcelableFuture.java")).r("Failed to unparcel value for %d.", this.a);
            this.b = true;
            this.g = e;
        }
    }
}
