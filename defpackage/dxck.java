package defpackage;

import android.util.SparseArray;
import android.view.ViewGroup;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxck {
    private final dwyf g;
    public boolean c = false;
    public boolean d = false;
    public boolean e = false;
    public int f = 0;
    public final Map a = new HashMap();
    public final SparseArray b = new SparseArray();

    public dxck(dwyf dwyfVar) {
        this.g = dwyfVar;
    }

    protected final int a(dwqw dwqwVar) {
        char c = 65535;
        if (!fbfm.h()) {
            if (dwqwVar.h().a() == 3) {
                String str = ((dwnt) dwqwVar.h().b()).a;
                Map map = this.a;
                if (map.containsKey(str)) {
                    return ((Integer) map.get(str)).intValue();
                }
            }
            return dwqwVar.h().a() - 1;
        }
        int iA = dwqwVar.h().a() - 1;
        if (iA == 1) {
            return 4;
        }
        if (iA != 2) {
            if (iA == 3) {
                return 4;
            }
            throw new IllegalArgumentException("Unexpected messageContent type: ".concat(dwql.a(dwqwVar.h().a())));
        }
        String str2 = ((dwnt) dwqwVar.h().b()).a;
        int iHashCode = str2.hashCode();
        if (iHashCode != -1165975421) {
            if (iHashCode == -989034367 && str2.equals("photos")) {
                c = 0;
            }
        } else if (str2.equals("link_preview")) {
            c = 1;
        }
        if (c == 0) {
            return 5;
        }
        if (c == 1) {
            return 6;
        }
        throw new IllegalArgumentException("Unsupported custom type: ".concat(((dwnt) dwqwVar.h().b()).a));
    }

    protected final dxcj b(ViewGroup viewGroup, int i) {
        String str;
        if (!fbfm.h()) {
            SparseArray sparseArray = this.b;
            if (sparseArray.get(i) != null) {
                return dwhj.a(viewGroup);
            }
            dxcf dxcfVar = new dxcf(viewGroup.getContext());
            dxcfVar.g = this.g;
            dxcfVar.a = this.c;
            dxcfVar.b = this.d;
            dxcfVar.c = this.e;
            return new dxci(dxcfVar);
        }
        int iA = dwyk.a(i);
        if (iA == 0) {
            throw null;
        }
        int i2 = iA - 1;
        if (i2 != 4) {
            if (i2 != 5 && i2 != 6) {
                switch (iA) {
                    case 1:
                        str = "SUGGESTION_LIST_CELL";
                        break;
                    case 2:
                        str = "RICH_CARD_BUBBLE_CELL";
                        break;
                    case 3:
                        str = "TOMBSTONE_BUBBLE_CELL";
                        break;
                    case 4:
                        str = "TYPING_INDICATOR_CELL";
                        break;
                    case 5:
                        str = "TEXT_MESSAGE_CONTENT";
                        break;
                    case 6:
                        str = "PHOTO_MESSAGE_CONTENT";
                        break;
                    case 7:
                        str = "LINK_PREVIEW_MESSAGE_CONTENT";
                        break;
                    case 8:
                        str = "SUGGESTION_CHIP_VIEW";
                        break;
                    case 9:
                        str = "STACK_CARD_VIEW";
                        break;
                    case 10:
                        str = "RICH_CARD_BUTTONS_UI_ELEMENT";
                        break;
                    case 11:
                        str = "RICH_TEXT_UI_ELEMENT";
                        break;
                    case 12:
                        str = "HORIZONTAL_LAYOUT_BUTTONS_UI_ELEMENT";
                        break;
                    case 13:
                        str = "IMAGE_ELEMENT_UI_ELEMENT";
                        break;
                    case 14:
                        str = "HORIZONTAL_LINE_UI_ELEMENT";
                        break;
                    case 15:
                        str = "STATUS_BADGE_UI_ELEMENT";
                        break;
                    case 16:
                        str = "VERTICAL_LAYOUT_BUTTON_VIEW";
                        break;
                    default:
                        str = "RICH_CARD_BUTTON_VIEW";
                        break;
                }
                throw new IllegalArgumentException("Unsupported view holder type: ".concat(str));
            }
            SparseArray sparseArray2 = this.b;
            if (sparseArray2.get(i2) != null) {
                return dwhj.a(viewGroup);
            }
        }
        dxcf dxcfVar2 = new dxcf(viewGroup.getContext());
        dxcfVar2.g = this.g;
        dxcfVar2.a = this.c;
        dxcfVar2.b = this.d;
        dxcfVar2.c = this.e;
        return new dxci(dxcfVar2);
    }
}
