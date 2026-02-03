package defpackage;

import com.android.vcard.VCardConstants;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dabp extends dacj {
    public final bxwt a;
    public final int b;
    private final dabv c;
    private final List d;
    private final List e;

    public dabp(bxwt bxwtVar, int i, dabv dabvVar, List list, List list2) {
        this.a = bxwtVar;
        this.b = i;
        this.c = dabvVar;
        if (list == null) {
            throw new NullPointerException("Null locationCardPresenters");
        }
        this.d = list;
        if (list2 == null) {
            throw new NullPointerException("Null linkCardViewModels");
        }
        this.e = list2;
    }

    @Override // defpackage.dacj
    public final bxwt a() {
        return this.a;
    }

    @Override // defpackage.dacj
    public final dabv b() {
        return this.c;
    }

    @Override // defpackage.dacj
    public final List c() {
        return this.e;
    }

    @Override // defpackage.dacj
    public final List d() {
        return this.d;
    }

    @Override // defpackage.dacj
    public final int e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dacj) {
            dacj dacjVar = (dacj) obj;
            if (this.a.equals(dacjVar.a()) && this.b == dacjVar.e() && this.c.equals(dacjVar.b()) && ekjz.h(this.d, dacjVar.d()) && ekjz.h(this.e, dacjVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        int i = this.b;
        String string = this.a.toString();
        String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "MULTI_RESULT_TYPE" : "SINGLE_RESULT_TYPE" : "NO_RESULTS" : "SEARCHING" : VCardConstants.PARAM_TYPE_HOME;
        dabv dabvVar = this.c;
        List list = this.d;
        List list2 = this.e;
        return "SearchResultsViewState{results=" + string + ", state=" + str + ", conversationSearchViewData=" + dabvVar.toString() + ", locationCardPresenters=" + list.toString() + ", linkCardViewModels=" + list2.toString() + "}";
    }
}
