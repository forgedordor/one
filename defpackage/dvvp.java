package defpackage;

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvvp {
    public static ejwi a(HashMap map) {
        try {
            dwix dwixVar = new dwix();
            dwixVar.e((String) map.get("RAW_TEXT"));
            if (map.containsKey("SKIP_LEADING_NEWLINE")) {
                dwixVar.f(((Boolean) map.get("SKIP_LEADING_NEWLINE")).booleanValue());
            }
            if (map.containsKey("PREDEFINED_STYLE")) {
                dwixVar.d(dwru.a(((Integer) map.get("PREDEFINED_STYLE")).intValue()));
            }
            if (map.containsKey("LINE_STYLES")) {
                ekgb ekgbVarB = dvib.b((ArrayList) map.get("LINE_STYLES"), new ejvr() { // from class: dvvg
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        HashMap map2 = (HashMap) obj;
                        try {
                            int iOrdinal = dwrs.a(((Integer) map2.get("LINE_STYLE_TYPE")).intValue()).ordinal();
                            if (iOrdinal == 0) {
                                return ejwi.j(dwlk.a);
                            }
                            if (iOrdinal == 1) {
                                return ejwi.j(new dwlj(((Integer) map2.get("INDENTATION")).intValue()));
                            }
                            if (iOrdinal == 2) {
                                return ejwi.j(dwli.a);
                            }
                            throw new RuntimeException(null, null);
                        } catch (Exception unused) {
                            dvhv.c("RichTextConverters", "failed to convert HashMap to LineStyle");
                            return ejud.a;
                        }
                    }
                });
                if (!ekgbVarB.isEmpty()) {
                    dwixVar.c(ekgbVarB);
                }
            }
            if (map.containsKey("FORMATTED_TEXT_SPANS")) {
                ekgb ekgbVarB2 = dvib.b((ArrayList) map.get("FORMATTED_TEXT_SPANS"), new ejvr() { // from class: dvvh
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        return dvvp.b((HashMap) obj);
                    }
                });
                if (!ekgbVarB2.isEmpty()) {
                    dwixVar.b(ekgbVarB2);
                }
            }
            return ejwi.j(dwixVar.a());
        } catch (TypeNotPresentException e) {
            throw e;
        } catch (Exception e2) {
            dvhv.d("RichTextConverters", "failed to convert HashMap to FormattedLine", e2);
            return ejud.a;
        }
    }

    public static ejwi b(HashMap map) {
        try {
            dwiz dwizVar = new dwiz();
            dwizVar.c(((Integer) map.get("START_INDEX")).intValue());
            dwizVar.b(((Integer) map.get("END_INDEX")).intValue());
            ekgb ekgbVarB = dvib.b((ArrayList) map.get("TEXT_STYLES"), new ejvr() { // from class: dvvn
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    HashMap map2 = (HashMap) obj;
                    try {
                        switch (dwrx.a(((Integer) map2.get("TEXT_STYLE_TYPE")).intValue())) {
                            case UNKNOWN:
                                return ejwi.j(new dwly());
                            case BOLD:
                                return ejwi.j(new dwln());
                            case ITALIC:
                                return ejwi.j(new dwlr());
                            case UNDERLINE:
                                return ejwi.j(new dwlx());
                            case STRIKETHROUGH:
                                return ejwi.j(new dwlt());
                            case SUPERSCRIPT:
                                return ejwi.j(new dwlv());
                            case SUBSCRIPT:
                                return ejwi.j(new dwlu());
                            case COLOR:
                                return ejwi.j(new dwlo(((Integer) map2.get("COLOR")).intValue()));
                            case BACKGROUND_COLOR:
                                return ejwi.j(new dwlm(((Integer) map2.get("BACKGROUND_COLOR")).intValue()));
                            case SIZE:
                                return ejwi.j(new dwls(((Integer) map2.get("SIZE")).intValue()));
                            case TYPEFACE_LIST:
                                return ejwi.j(dwma.a(dvib.c((ArrayList) map2.get("TYPEFACE_LIST"), new ejvr() { // from class: dvvl
                                    @Override // defpackage.ejvr
                                    public final Object apply(Object obj2) {
                                        return dwrz.a(((Integer) obj2).intValue());
                                    }
                                })));
                            case HORIZONTAL_ALIGNMENT:
                                return ejwi.j(new dwlp(((Integer) map2.get("HORIZONTAL_ALIGNMENT")).intValue()));
                            case HYPER_LINK:
                                dwoi dwoiVar = new dwoi();
                                dwoiVar.b((String) map2.get("HYPER_LINK_V2"));
                                return ejwi.j(new dwlq(dwoiVar.a()));
                            default:
                                throw new RuntimeException(null, null);
                        }
                    } catch (Exception e) {
                        dvhv.c("RichTextConverters", "Failed to convert HashMap to TextStyle");
                        if (map2.containsKey("HYPER_LINK")) {
                            throw new TypeNotPresentException("HYPER_LINK no longer supports reading from deprecated HYPER_LINK key", e);
                        }
                        return ejud.a;
                    }
                }
            });
            if (ekgbVarB.isEmpty()) {
                return ejud.a;
            }
            dwizVar.d(ekgbVarB);
            return ejwi.j(dwizVar.a());
        } catch (TypeNotPresentException e) {
            throw e;
        } catch (Exception unused) {
            dvhv.c("RichTextConverters", "failed to convert HashMap to FormattedTextSpan");
            return ejud.a;
        }
    }

    public static ejwi c(HashMap map) {
        try {
            ekgb ekgbVarB = dvib.b((ArrayList) map.get("FORMATTED_LINES"), new ejvr() { // from class: dvvf
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    return dvvp.a((HashMap) obj);
                }
            });
            if (ekgbVarB.isEmpty()) {
                return ejud.a;
            }
            dwiv dwivVar = new dwiv();
            dwivVar.b(ekgbVarB);
            return ejwi.j(dwivVar.a());
        } catch (Exception unused) {
            dvhv.c("RichTextConverters", "failed to convert HashMap to RichText");
            return ejud.a;
        }
    }

    public static HashMap d(dwsa dwsaVar) {
        HashMap map = new HashMap();
        map.put("FORMATTED_LINES", dvib.d(dwsaVar.a(), new ejvr() { // from class: dvvm
            /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, java.util.Collection] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, java.util.Collection] */
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                dwrl dwrlVar = (dwrl) obj;
                HashMap map2 = new HashMap();
                map2.put("RAW_TEXT", dwrlVar.e());
                if (dwrlVar.c().g()) {
                    map2.put("PREDEFINED_STYLE", Integer.valueOf(((dwru) dwrlVar.c().c()).g));
                }
                if (dwrlVar.b().g()) {
                    map2.put("LINE_STYLES", dvib.d(dwrlVar.b().c(), new ejvr() { // from class: dvvi
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            dwrq dwrqVar = (dwrq) obj2;
                            HashMap map3 = new HashMap();
                            map3.put("LINE_STYLE_TYPE", Integer.valueOf(dwrqVar.a().d));
                            if (dwrqVar.a() == dwrs.INDENTATION) {
                                map3.put("INDENTATION", Integer.valueOf(dwrqVar.b()));
                            }
                            return map3;
                        }
                    }));
                }
                if (dwrlVar.a().g()) {
                    map2.put("FORMATTED_TEXT_SPANS", dvib.d(dwrlVar.a().c(), new ejvr() { // from class: dvvj
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            dwrn dwrnVar = (dwrn) obj2;
                            HashMap map3 = new HashMap();
                            map3.put("START_INDEX", Integer.valueOf(dwrnVar.b()));
                            map3.put("END_INDEX", Integer.valueOf(dwrnVar.a()));
                            map3.put("TEXT_STYLES", dvib.d(dwrnVar.c(), new ejvr() { // from class: dvvo
                                @Override // defpackage.ejvr
                                public final Object apply(Object obj3) {
                                    dwrv dwrvVar = (dwrv) obj3;
                                    HashMap map4 = new HashMap();
                                    map4.put("TEXT_STYLE_TYPE", Integer.valueOf(dwrvVar.b().n));
                                    if (dwrvVar.b() == dwrx.COLOR) {
                                        map4.put("COLOR", Integer.valueOf(dwrvVar.d()));
                                    }
                                    if (dwrvVar.b() == dwrx.BACKGROUND_COLOR) {
                                        map4.put("BACKGROUND_COLOR", Integer.valueOf(dwrvVar.a()));
                                    }
                                    if (dwrvVar.b() == dwrx.SIZE) {
                                        map4.put("SIZE", Integer.valueOf(dwrvVar.h()));
                                    }
                                    if (dwrvVar.b() == dwrx.TYPEFACE_LIST) {
                                        map4.put("TYPEFACE_LIST", dvib.d(dwrvVar.l(), new ejvr() { // from class: dvvk
                                            @Override // defpackage.ejvr
                                            public final Object apply(Object obj4) {
                                                return Integer.valueOf(((dwrz) obj4).j);
                                            }
                                        }));
                                    }
                                    if (dwrvVar.b() == dwrx.HORIZONTAL_ALIGNMENT) {
                                        map4.put("HORIZONTAL_ALIGNMENT", Integer.valueOf(dwrvVar.e()));
                                    }
                                    if (dwrvVar.b() == dwrx.HYPER_LINK) {
                                        map4.put("HYPER_LINK_V2", ((dwoj) dwrvVar.f()).a);
                                    }
                                    return map4;
                                }
                            }));
                            return map3;
                        }
                    }));
                }
                if (dwrlVar.d().g()) {
                    map2.put("SKIP_LEADING_NEWLINE", dwrlVar.d().c());
                }
                return map2;
            }
        }));
        return map;
    }
}
