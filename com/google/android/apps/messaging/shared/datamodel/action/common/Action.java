package com.google.android.apps.messaging.shared.datamodel.action.common;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.aooo;
import defpackage.aooq;
import defpackage.ayme;
import defpackage.aymf;
import defpackage.aymg;
import defpackage.aymj;
import defpackage.aymk;
import defpackage.ayml;
import defpackage.aymn;
import defpackage.aymo;
import defpackage.aymr;
import defpackage.aymy;
import defpackage.cldb;
import defpackage.cogw;
import defpackage.cqaz;
import defpackage.cqtf;
import defpackage.dhim;
import defpackage.eieu;
import defpackage.eiju;
import defpackage.eijx;
import defpackage.elgm;
import defpackage.eoqg;
import defpackage.fcsu;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class Action<ResultT> implements Parcelable {
    private final fcsu c;
    private final fcsu d;
    public final String u;
    public final aymo v;
    public List w = new ArrayList();
    public aymr x;
    public final elgm y;
    public final ArrayList z;
    public static final long t = TimeUnit.SECONDS.toMillis(6);
    private static final Object a = new Object();
    private static long b = -1;

    /* compiled from: PG */
    public interface a {
        fcsu gc();

        fcsu gd();

        fcsu gu();

        cogw y();
    }

    public Action(Bundle bundle, elgm elgmVar) {
        ArrayList arrayListN;
        a aVar = (a) cqtf.a(a.class);
        this.c = aVar.gc();
        fcsu fcsuVarGd = aVar.gd();
        this.d = fcsuVarGd;
        this.u = h(getClass().getSimpleName(), aVar.y());
        this.y = elgmVar;
        ActionParameters actionParameters = new ActionParameters(bundle);
        this.v = actionParameters;
        if (((aooo) fcsuVarGd.b()).a()) {
            arrayListN = actionParameters.n("action_callstack_key", ParcelableStackTraceElement.class);
            if (arrayListN == null) {
                arrayListN = j();
            }
        } else {
            arrayListN = null;
        }
        this.z = arrayListN;
    }

    private static String h(String str, cogw cogwVar) {
        long j;
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append(":");
        synchronized (a) {
            long jA = b;
            if (jA == -1) {
                jA = cogwVar.a() * 1000;
            }
            j = jA + 1;
            b = j;
        }
        sb.append(j);
        return sb.toString();
    }

    private static ArrayList j() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        ArrayList arrayList = new ArrayList(stackTrace.length);
        for (int i = 0; i < stackTrace.length && i < 10; i++) {
            arrayList.add(new ParcelableStackTraceElement(stackTrace[i]));
        }
        return arrayList;
    }

    public static ayme o(List list, Throwable th) {
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[list.size()];
        for (int i = 0; i < list.size() && i < 10; i++) {
            ParcelableStackTraceElement parcelableStackTraceElement = (ParcelableStackTraceElement) list.get(i);
            stackTraceElementArr[i] = new StackTraceElement(parcelableStackTraceElement.a, parcelableStackTraceElement.b, parcelableStackTraceElement.c, parcelableStackTraceElement.d);
        }
        ayme aymeVar = new ayme(th);
        aymeVar.setStackTrace(stackTraceElementArr);
        return aymeVar;
    }

    @Deprecated
    public void A(ayml aymlVar) {
        F(aymlVar);
    }

    public final void B(Action action) {
        ayml.b(this.u, new aymk(new aymf(), this));
        ((aymn) this.c.b()).h(this, action);
    }

    public final void C(Parcel parcel, int i) {
        parcel.writeString(this.u);
        parcel.writeParcelable(this.v.i(), i);
    }

    public final boolean D() {
        return !this.w.isEmpty();
    }

    public void E(long j) {
        ((aymn) this.c.b()).i(this, j);
    }

    public void F(ayml aymlVar) {
        ayml.b(this.u, aymlVar);
        ((aymn) this.c.b()).e(this);
    }

    public final void G(aymj aymjVar) {
        F(new aymk(aymjVar, this));
    }

    public abstract eieu a();

    public Object b() {
        return null;
    }

    public abstract String c();

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public eiju e() {
        return eijx.g(new Callable() { // from class: aymb
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.b();
            }
        }, eoqg.a);
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof Action)) {
            return this.u.equals(((Action) obj).u);
        }
        return false;
    }

    public Bundle fP() {
        return null;
    }

    public eiju fQ() {
        return eijx.g(new Callable() { // from class: aymd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.fP();
            }
        }, eoqg.a);
    }

    public eiju fR() {
        return eijx.g(new Callable() { // from class: ayma
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return null;
            }
        }, eoqg.a);
    }

    public Object fS(Bundle bundle) {
        return null;
    }

    public boolean fT() {
        return true;
    }

    public final int hashCode() {
        return this.u.hashCode();
    }

    public final eiju p() {
        return ((aymn) this.c.b()).b(this);
    }

    public ListenableFuture q(cldb cldbVar) {
        fcsu fcsuVar = this.c;
        return ((aymn) fcsuVar.b()).c(this, cldbVar, aymr.a(this));
    }

    public final ListenableFuture r() {
        return ((aymn) this.c.b()).d(this);
    }

    public ListenableFuture s() {
        return ((aymn) this.c.b()).e(this);
    }

    public final Throwable t(Throwable th) {
        ArrayList arrayList = this.z;
        return arrayList == null ? th : o(arrayList, th);
    }

    public final String toString() {
        return String.valueOf(getClass()) + "-" + this.u;
    }

    public final void u(int i) {
        ((aymn) this.c.b()).f(this, i);
    }

    public final void v() {
        this.w.add(this);
    }

    public void w(long j) {
        fcsu fcsuVar = this.c;
        ((aymn) fcsuVar.b()).g(this, aymr.a(this), j);
    }

    public final void x(int i, long j) {
        ((aymn) this.c.b()).g(this, i, j);
    }

    public final void y(aymr aymrVar) {
        if (!aymrVar.d.contains(this)) {
            throw new IllegalStateException("Call Job.addForegroundAction or Job.addBackgroundAction instead");
        }
        this.x = aymrVar;
    }

    @Deprecated
    public final void z() {
        A(new aymk(new aymf(), this));
    }

    /* compiled from: PG */
    public static final class ParcelableStackTraceElement implements Parcelable {
        public static final Parcelable.Creator<ParcelableStackTraceElement> CREATOR = new aymg();
        public final String a;
        public final String b;
        public final String c;
        public final int d;

        public ParcelableStackTraceElement(Parcel parcel) {
            String string = parcel.readString();
            this.a = string == null ? "Unparcelling Error" : string;
            String string2 = parcel.readString();
            this.b = string2 != null ? string2 : "Unparcelling Error";
            this.c = parcel.readString();
            this.d = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.a);
            parcel.writeString(this.b);
            parcel.writeString(this.c);
            parcel.writeInt(this.d);
        }

        public ParcelableStackTraceElement(StackTraceElement stackTraceElement) {
            this.a = stackTraceElement.getClassName();
            this.b = stackTraceElement.getMethodName();
            this.c = stackTraceElement.getFileName();
            this.d = stackTraceElement.getLineNumber();
        }
    }

    public Action(Parcel parcel, elgm elgmVar) {
        ArrayList arrayListN;
        a aVar = (a) cqtf.a(a.class);
        this.c = aVar.gc();
        fcsu fcsuVarGd = aVar.gd();
        this.d = fcsuVarGd;
        String string = parcel.readString();
        string.getClass();
        this.u = string;
        cqaz.f(dhim.d(string));
        this.y = elgmVar;
        try {
            aymo actionParameters = (ActionParameters) parcel.readParcelable(ActionParameters.class.getClassLoader());
            if (((aooq) aVar.gu().b()).a()) {
                if (actionParameters == null) {
                    actionParameters = new aymy();
                }
            } else if (actionParameters == null) {
                actionParameters = new ActionParameters();
            }
            this.v = actionParameters;
            if (((aooo) fcsuVarGd.b()).a()) {
                arrayListN = actionParameters.n("action_callstack_key", ParcelableStackTraceElement.class);
                if (arrayListN == null) {
                    arrayListN = j();
                }
            } else {
                arrayListN = null;
            }
            this.z = arrayListN;
        } catch (BadParcelableException e) {
            cqaz.p("Failed to unparcel action parameters", e);
            throw e;
        }
    }

    public Action(aymo aymoVar, String str, elgm elgmVar) {
        ArrayList arrayListN;
        a aVar = (a) cqtf.a(a.class);
        this.c = aVar.gc();
        fcsu fcsuVarGd = aVar.gd();
        this.d = fcsuVarGd;
        this.u = str;
        this.y = elgmVar;
        this.v = aymoVar;
        if (((aooo) fcsuVarGd.b()).a()) {
            arrayListN = aymoVar.n("action_callstack_key", ParcelableStackTraceElement.class);
            if (arrayListN == null) {
                arrayListN = j();
            }
        } else {
            arrayListN = null;
        }
        this.z = arrayListN;
    }

    protected Action(elgm elgmVar) {
        a aVar = (a) cqtf.a(a.class);
        this.c = aVar.gc();
        fcsu fcsuVarGd = aVar.gd();
        this.d = fcsuVarGd;
        this.u = h(getClass().getSimpleName(), aVar.y());
        this.y = elgmVar;
        if (((aooq) aVar.gu().b()).a()) {
            this.v = new aymy();
        } else {
            this.v = new ActionParameters();
        }
        if (!((aooo) fcsuVarGd.b()).a()) {
            this.z = null;
            return;
        }
        ArrayList arrayListJ = j();
        this.z = arrayListJ;
        this.v.u("action_callstack_key", arrayListJ);
    }

    protected Action(String str, elgm elgmVar) {
        cqaz.f(dhim.d(str));
        a aVar = (a) cqtf.a(a.class);
        this.c = aVar.gc();
        fcsu fcsuVarGd = aVar.gd();
        this.d = fcsuVarGd;
        this.u = str;
        this.y = elgmVar;
        if (((aooq) aVar.gu().b()).a()) {
            this.v = new aymy();
        } else {
            this.v = new ActionParameters();
        }
        if (!((aooo) fcsuVarGd.b()).a()) {
            this.z = null;
            return;
        }
        ArrayList arrayListJ = j();
        this.z = arrayListJ;
        this.v.u("action_callstack_key", arrayListJ);
    }
}
