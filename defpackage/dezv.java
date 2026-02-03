package defpackage;

import android.text.TextUtils;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dezv {
    public String a;
    public Optional b;
    public dezw c;
    public dezz d;
    public Optional e;
    public dezu f;
    public Optional g;
    public List h;
    public Optional i;
    public final String j;
    public dfae k;

    public dezv(dezv dezvVar) {
        this.b = Optional.empty();
        this.c = dezw.NONE;
        this.d = dezz.UNKNOWN;
        this.e = Optional.empty();
        this.f = dezu.UNKNOWN;
        this.g = Optional.empty();
        this.h = new ArrayList();
        this.i = Optional.empty();
        this.c = dezvVar.c;
        this.f = dezvVar.f;
        this.k = dezvVar.k;
        this.j = dezvVar.j;
    }

    public final void a(dezv dezvVar) {
        if (dezvVar.b()) {
            if (dezvVar.k == dfae.FULL) {
                this.i = dezvVar.i;
                this.g = dezvVar.g;
                this.f = dezvVar.f;
                this.a = dezvVar.a;
                this.e = dezvVar.e;
                this.d = dezvVar.d;
                this.h = dezvVar.h;
                this.b = dezvVar.b;
                this.c = dezvVar.c;
                return;
            }
            dfae dfaeVar = dezvVar.k;
            if (dfaeVar != dfae.PARTIAL) {
                dfae dfaeVar2 = dfae.DELETED;
                if (dfaeVar == dfaeVar2) {
                    this.k = dfaeVar2;
                    return;
                }
                return;
            }
            if (dezvVar.i.isPresent()) {
                this.i = dezvVar.i;
            }
            if (dezvVar.g.isPresent()) {
                this.g = dezvVar.g;
            }
            if (dezvVar.f != dezu.UNKNOWN) {
                this.f = dezvVar.f;
            }
            String str = dezvVar.a;
            if (str != null) {
                this.a = str;
            }
            if (dezvVar.e.isPresent()) {
                this.e = dezvVar.e;
            }
            if (dezvVar.d != dezz.UNKNOWN) {
                this.d = dezvVar.d;
            }
            this.h.clear();
            this.h.addAll(dezvVar.h);
            if (dezvVar.b.isPresent()) {
                this.b = dezvVar.b;
            }
            if (dezvVar.c != dezw.NONE) {
                this.c = dezvVar.c;
            }
        }
    }

    public final boolean b() {
        if (TextUtils.isEmpty(this.j)) {
            return false;
        }
        if (this.k == dfae.NONE) {
            dhja.q("Invalid endpoint. State is NONE.", new Object[0]);
            return false;
        }
        if (this.k != dfae.FULL || this.c != dezw.NONE) {
            return true;
        }
        dhja.q("Invalid endpoint. Full state does not have a status.", new Object[0]);
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof dezv)) {
            return false;
        }
        dezv dezvVar = (dezv) obj;
        return this.i.equals(dezvVar.i) && this.g.equals(dezvVar.g) && this.f == dezvVar.f && TextUtils.equals(this.a, dezvVar.a) && TextUtils.equals(this.j, dezvVar.j) && this.e.equals(dezvVar.e) && this.d == dezvVar.d && this.h.equals(dezvVar.h) && this.b.equals(dezvVar.b) && this.k == dezvVar.k && this.c == dezvVar.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.i, this.g, this.f, this.a, this.j, this.e, this.d, this.h, this.b, this.k, this.c});
    }

    public final String toString() {
        dhiz dhizVar = dhiz.USER_ID;
        return "EndPoint [mDisplayText=" + dhizVar.c(this.a) + ", mReferred=" + String.valueOf(this.b) + ", mStatus=" + String.valueOf(this.c) + ", mJoiningMethod=" + String.valueOf(this.d) + ", mJoiningInfo=" + String.valueOf(this.e) + ", mDisconnectionMethod=" + String.valueOf(this.f) + ", mDisconnectionInfo=" + String.valueOf(this.g) + ", mMedia=" + String.valueOf(this.h) + ", mCallinfo=" + String.valueOf(this.i) + ", mEntity=" + dhizVar.c(this.j) + ", mState=" + String.valueOf(this.k) + ", mAnyAttr=]";
    }

    public dezv(dfae dfaeVar, String str) {
        this.b = Optional.empty();
        this.c = dezw.NONE;
        this.d = dezz.UNKNOWN;
        this.e = Optional.empty();
        this.f = dezu.UNKNOWN;
        this.g = Optional.empty();
        this.h = new ArrayList();
        this.i = Optional.empty();
        this.k = dfaeVar;
        this.j = str;
    }
}
