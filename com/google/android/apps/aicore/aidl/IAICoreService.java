package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.apps.aicore.aidl.IAstroboyService;
import com.google.android.apps.aicore.aidl.IBaymaxService;
import com.google.android.apps.aicore.aidl.ICortanaService;
import com.google.android.apps.aicore.aidl.IDownloadListener;
import com.google.android.apps.aicore.aidl.IDownloadListener2;
import com.google.android.apps.aicore.aidl.IImageDescriptionService;
import com.google.android.apps.aicore.aidl.IInfoExtractionService;
import com.google.android.apps.aicore.aidl.ILLMService;
import com.google.android.apps.aicore.aidl.IMagicRewriteService;
import com.google.android.apps.aicore.aidl.IMockService;
import com.google.android.apps.aicore.aidl.IOcrService;
import com.google.android.apps.aicore.aidl.IOptimusService;
import com.google.android.apps.aicore.aidl.IProofreadingService;
import com.google.android.apps.aicore.aidl.IQuestionToAnswerService;
import com.google.android.apps.aicore.aidl.IRosieRobotService;
import com.google.android.apps.aicore.aidl.ISmartReplyService;
import com.google.android.apps.aicore.aidl.ISonnyService;
import com.google.android.apps.aicore.aidl.ISuggestedTextService;
import com.google.android.apps.aicore.aidl.ISummarizationService;
import com.google.android.apps.aicore.aidl.ITarsService;
import com.google.android.apps.aicore.aidl.ITextClassificationService;
import com.google.android.apps.aicore.aidl.ITextEmbeddingService;
import com.google.android.apps.aicore.aidl.ITextToImageService;
import defpackage.sgh;
import defpackage.sgj;
import defpackage.sis;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IAICoreService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IAICoreService {
        static final int TRANSACTION_getApiVersion = 11;
        static final int TRANSACTION_getAstroboyService = 28;
        static final int TRANSACTION_getBaymaxService = 25;
        static final int TRANSACTION_getCortanaService = 35;
        static final int TRANSACTION_getDownloadableSizeInBytes = 19;
        static final int TRANSACTION_getFeature = 14;
        static final int TRANSACTION_getFeatureOrControl = 32;
        static final int TRANSACTION_getFeatureStatus = 3;
        static final int TRANSACTION_getImageDescriptionService = 30;
        static final int TRANSACTION_getInfoExtractionService = 24;
        static final int TRANSACTION_getLLMLegionService = 34;
        static final int TRANSACTION_getLLMService = 5;
        static final int TRANSACTION_getMagicRewriteService = 15;
        static final int TRANSACTION_getMockService = 20;
        static final int TRANSACTION_getOcrService = 18;
        static final int TRANSACTION_getOptimusService = 29;
        static final int TRANSACTION_getProofreadingService = 9;
        static final int TRANSACTION_getQuestionToAnswerService = 23;
        static final int TRANSACTION_getRosieRobotService = 27;
        static final int TRANSACTION_getSmartReplyService = 8;
        static final int TRANSACTION_getSonnyService = 31;
        static final int TRANSACTION_getSuggestedTextService = 16;
        static final int TRANSACTION_getSummarizationLegionService = 36;
        static final int TRANSACTION_getSummarizationService = 6;
        static final int TRANSACTION_getTarsService = 26;
        static final int TRANSACTION_getTextClassificationService = 21;
        static final int TRANSACTION_getTextEmbeddingService = 17;
        static final int TRANSACTION_getTextToImageService = 10;
        static final int TRANSACTION_getTokenCapacity = 22;
        static final int TRANSACTION_initializeSafety = 33;
        static final int TRANSACTION_isPersistentModeEnabled = 13;
        static final int TRANSACTION_listFeatures = 2;
        static final int TRANSACTION_requestDownloadableFeature = 4;
        static final int TRANSACTION_requestDownloadableFeatureWithDownloadListener = 7;
        static final int TRANSACTION_requestDownloadableFeatureWithDownloadListener2 = 12;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IAICoreService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.aicore.aidl.IAICoreService");
            }

            @Override // com.google.android.apps.aicore.aidl.IAICoreService
            public int getApiVersion() {
                Parcel parcelTransactAndReadException = transactAndReadException(11, obtainAndWriteInterfaceToken());
                int i = parcelTransactAndReadException.readInt();
                parcelTransactAndReadException.recycle();
                return i;
            }

            @Override // com.google.android.apps.aicore.aidl.IAICoreService
            public IAstroboyService getAstroboyService(sgj sgjVar) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, sgjVar);
                Parcel parcelTransactAndReadException = transactAndReadException(28, parcelObtainAndWriteInterfaceToken);
                IAstroboyService iAstroboyServiceAsInterface = IAstroboyService.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iAstroboyServiceAsInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.IAICoreService
            public IBaymaxService getBaymaxService(sgj sgjVar) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, sgjVar);
                Parcel parcelTransactAndReadException = transactAndReadException(25, parcelObtainAndWriteInterfaceToken);
                IBaymaxService iBaymaxServiceAsInterface = IBaymaxService.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iBaymaxServiceAsInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.IAICoreService
            public ICortanaService getCortanaService(sgj sgjVar) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, sgjVar);
                Parcel parcelTransactAndReadException = transactAndReadException(35, parcelObtainAndWriteInterfaceToken);
                ICortanaService iCortanaServiceAsInterface = ICortanaService.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iCortanaServiceAsInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.IAICoreService
            public long getDownloadableSizeInBytes(sgj sgjVar) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, sgjVar);
                Parcel parcelTransactAndReadException = transactAndReadException(19, parcelObtainAndWriteInterfaceToken);
                long j = parcelTransactAndReadException.readLong();
                parcelTransactAndReadException.recycle();
                return j;
            }

            @Override // com.google.android.apps.aicore.aidl.IAICoreService
            public sgj getFeature(int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                Parcel parcelTransactAndReadException = transactAndReadException(14, parcelObtainAndWriteInterfaceToken);
                sgj sgjVar = (sgj) sgh.a(parcelTransactAndReadException, sgj.CREATOR);
                parcelTransactAndReadException.recycle();
                return sgjVar;
            }

            @Override // com.google.android.apps.aicore.aidl.IAICoreService
            public sgj getFeatureOrControl(int i, int i2) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                parcelObtainAndWriteInterfaceToken.writeInt(i2);
                Parcel parcelTransactAndReadException = transactAndReadException(32, parcelObtainAndWriteInterfaceToken);
                sgj sgjVar = (sgj) sgh.a(parcelTransactAndReadException, sgj.CREATOR);
                parcelTransactAndReadException.recycle();
                return sgjVar;
            }

            @Override // com.google.android.apps.aicore.aidl.IAICoreService
            public int getFeatureStatus(sgj sgjVar) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, sgjVar);
                Parcel parcelTransactAndReadException = transactAndReadException(3, parcelObtainAndWriteInterfaceToken);
                int i = parcelTransactAndReadException.readInt();
                parcelTransactAndReadException.recycle();
                return i;
            }

            @Override // com.google.android.apps.aicore.aidl.IAICoreService
            public IImageDescriptionService getImageDescriptionService(sgj sgjVar) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, sgjVar);
                Parcel parcelTransactAndReadException = transactAndReadException(30, parcelObtainAndWriteInterfaceToken);
                IImageDescriptionService iImageDescriptionServiceAsInterface = IImageDescriptionService.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iImageDescriptionServiceAsInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.IAICoreService
            public IInfoExtractionService getInfoExtractionService(sgj sgjVar) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, sgjVar);
                Parcel parcelTransactAndReadException = transactAndReadException(24, parcelObtainAndWriteInterfaceToken);
                IInfoExtractionService iInfoExtractionServiceAsInterface = IInfoExtractionService.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iInfoExtractionServiceAsInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.IAICoreService
            public ILLMService getLLMLegionService(sgj sgjVar, sis sisVar) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, sgjVar);
                sgh.d(parcelObtainAndWriteInterfaceToken, sisVar);
                Parcel parcelTransactAndReadException = transactAndReadException(34, parcelObtainAndWriteInterfaceToken);
                ILLMService iLLMServiceAsInterface = ILLMService.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iLLMServiceAsInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.IAICoreService
            public ILLMService getLLMService(sgj sgjVar) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, sgjVar);
                Parcel parcelTransactAndReadException = transactAndReadException(5, parcelObtainAndWriteInterfaceToken);
                ILLMService iLLMServiceAsInterface = ILLMService.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iLLMServiceAsInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.IAICoreService
            public IMagicRewriteService getMagicRewriteService(sgj sgjVar) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, sgjVar);
                Parcel parcelTransactAndReadException = transactAndReadException(15, parcelObtainAndWriteInterfaceToken);
                IMagicRewriteService iMagicRewriteServiceAsInterface = IMagicRewriteService.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iMagicRewriteServiceAsInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.IAICoreService
            public IMockService getMockService() {
                Parcel parcelTransactAndReadException = transactAndReadException(20, obtainAndWriteInterfaceToken());
                IMockService iMockServiceAsInterface = IMockService.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iMockServiceAsInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.IAICoreService
            public IOcrService getOcrService(sgj sgjVar) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, sgjVar);
                Parcel parcelTransactAndReadException = transactAndReadException(18, parcelObtainAndWriteInterfaceToken);
                IOcrService iOcrServiceAsInterface = IOcrService.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iOcrServiceAsInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.IAICoreService
            public IOptimusService getOptimusService(sgj sgjVar) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, sgjVar);
                Parcel parcelTransactAndReadException = transactAndReadException(29, parcelObtainAndWriteInterfaceToken);
                IOptimusService iOptimusServiceAsInterface = IOptimusService.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iOptimusServiceAsInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.IAICoreService
            public IProofreadingService getProofreadingService(sgj sgjVar) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, sgjVar);
                Parcel parcelTransactAndReadException = transactAndReadException(9, parcelObtainAndWriteInterfaceToken);
                IProofreadingService iProofreadingServiceAsInterface = IProofreadingService.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iProofreadingServiceAsInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.IAICoreService
            public IQuestionToAnswerService getQuestionToAnswerService(sgj sgjVar) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, sgjVar);
                Parcel parcelTransactAndReadException = transactAndReadException(23, parcelObtainAndWriteInterfaceToken);
                IQuestionToAnswerService iQuestionToAnswerServiceAsInterface = IQuestionToAnswerService.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iQuestionToAnswerServiceAsInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.IAICoreService
            public IRosieRobotService getRosieRobotService(sgj sgjVar) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, sgjVar);
                Parcel parcelTransactAndReadException = transactAndReadException(27, parcelObtainAndWriteInterfaceToken);
                IRosieRobotService iRosieRobotServiceAsInterface = IRosieRobotService.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iRosieRobotServiceAsInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.IAICoreService
            public ISmartReplyService getSmartReplyService(sgj sgjVar) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, sgjVar);
                Parcel parcelTransactAndReadException = transactAndReadException(8, parcelObtainAndWriteInterfaceToken);
                ISmartReplyService iSmartReplyServiceAsInterface = ISmartReplyService.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iSmartReplyServiceAsInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.IAICoreService
            public ISonnyService getSonnyService(sgj sgjVar) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, sgjVar);
                Parcel parcelTransactAndReadException = transactAndReadException(31, parcelObtainAndWriteInterfaceToken);
                ISonnyService iSonnyServiceAsInterface = ISonnyService.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iSonnyServiceAsInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.IAICoreService
            public ISuggestedTextService getSuggestedTextService(sgj sgjVar) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, sgjVar);
                Parcel parcelTransactAndReadException = transactAndReadException(16, parcelObtainAndWriteInterfaceToken);
                ISuggestedTextService iSuggestedTextServiceAsInterface = ISuggestedTextService.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iSuggestedTextServiceAsInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.IAICoreService
            public ISummarizationService getSummarizationLegionService(sgj sgjVar, sis sisVar) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, sgjVar);
                sgh.d(parcelObtainAndWriteInterfaceToken, sisVar);
                Parcel parcelTransactAndReadException = transactAndReadException(36, parcelObtainAndWriteInterfaceToken);
                ISummarizationService iSummarizationServiceAsInterface = ISummarizationService.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iSummarizationServiceAsInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.IAICoreService
            public ISummarizationService getSummarizationService(sgj sgjVar) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, sgjVar);
                Parcel parcelTransactAndReadException = transactAndReadException(6, parcelObtainAndWriteInterfaceToken);
                ISummarizationService iSummarizationServiceAsInterface = ISummarizationService.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iSummarizationServiceAsInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.IAICoreService
            public ITarsService getTarsService(sgj sgjVar) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, sgjVar);
                Parcel parcelTransactAndReadException = transactAndReadException(26, parcelObtainAndWriteInterfaceToken);
                ITarsService iTarsServiceAsInterface = ITarsService.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iTarsServiceAsInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.IAICoreService
            public ITextClassificationService getTextClassificationService(sgj sgjVar) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, sgjVar);
                Parcel parcelTransactAndReadException = transactAndReadException(21, parcelObtainAndWriteInterfaceToken);
                ITextClassificationService iTextClassificationServiceAsInterface = ITextClassificationService.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iTextClassificationServiceAsInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.IAICoreService
            public ITextEmbeddingService getTextEmbeddingService(sgj sgjVar) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, sgjVar);
                Parcel parcelTransactAndReadException = transactAndReadException(17, parcelObtainAndWriteInterfaceToken);
                ITextEmbeddingService iTextEmbeddingServiceAsInterface = ITextEmbeddingService.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iTextEmbeddingServiceAsInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.IAICoreService
            public ITextToImageService getTextToImageService(sgj sgjVar) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, sgjVar);
                Parcel parcelTransactAndReadException = transactAndReadException(10, parcelObtainAndWriteInterfaceToken);
                ITextToImageService iTextToImageServiceAsInterface = ITextToImageService.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iTextToImageServiceAsInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.IAICoreService
            public int getTokenCapacity(sgj sgjVar) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, sgjVar);
                Parcel parcelTransactAndReadException = transactAndReadException(22, parcelObtainAndWriteInterfaceToken);
                int i = parcelTransactAndReadException.readInt();
                parcelTransactAndReadException.recycle();
                return i;
            }

            @Override // com.google.android.apps.aicore.aidl.IAICoreService
            public void initializeSafety(sgj sgjVar, IDownloadListener2 iDownloadListener2) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, sgjVar);
                sgh.f(parcelObtainAndWriteInterfaceToken, iDownloadListener2);
                transactAndReadExceptionReturnVoid(33, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.IAICoreService
            public boolean isPersistentModeEnabled() {
                Parcel parcelTransactAndReadException = transactAndReadException(13, obtainAndWriteInterfaceToken());
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.apps.aicore.aidl.IAICoreService
            public sgj[] listFeatures() {
                Parcel parcelTransactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken());
                sgj[] sgjVarArr = (sgj[]) parcelTransactAndReadException.createTypedArray(sgj.CREATOR);
                parcelTransactAndReadException.recycle();
                return sgjVarArr;
            }

            @Override // com.google.android.apps.aicore.aidl.IAICoreService
            public int requestDownloadableFeature(sgj sgjVar) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, sgjVar);
                Parcel parcelTransactAndReadException = transactAndReadException(4, parcelObtainAndWriteInterfaceToken);
                int i = parcelTransactAndReadException.readInt();
                parcelTransactAndReadException.recycle();
                return i;
            }

            @Override // com.google.android.apps.aicore.aidl.IAICoreService
            public int requestDownloadableFeatureWithDownloadListener(sgj sgjVar, IDownloadListener iDownloadListener) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, sgjVar);
                sgh.f(parcelObtainAndWriteInterfaceToken, iDownloadListener);
                Parcel parcelTransactAndReadException = transactAndReadException(7, parcelObtainAndWriteInterfaceToken);
                int i = parcelTransactAndReadException.readInt();
                parcelTransactAndReadException.recycle();
                return i;
            }

            @Override // com.google.android.apps.aicore.aidl.IAICoreService
            public int requestDownloadableFeatureWithDownloadListener2(sgj sgjVar, IDownloadListener2 iDownloadListener2) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, sgjVar);
                sgh.f(parcelObtainAndWriteInterfaceToken, iDownloadListener2);
                Parcel parcelTransactAndReadException = transactAndReadException(12, parcelObtainAndWriteInterfaceToken);
                int i = parcelTransactAndReadException.readInt();
                parcelTransactAndReadException.recycle();
                return i;
            }
        }

        public Stub() {
            super("com.google.android.apps.aicore.aidl.IAICoreService");
        }

        public static IAICoreService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.IAICoreService");
            return iInterfaceQueryLocalInterface instanceof IAICoreService ? (IAICoreService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 2:
                    sgj[] sgjVarArrListFeatures = listFeatures();
                    parcel2.writeNoException();
                    parcel2.writeTypedArray(sgjVarArrListFeatures, 1);
                    return true;
                case 3:
                    sgj sgjVar = (sgj) sgh.a(parcel, sgj.CREATOR);
                    enforceNoDataAvail(parcel);
                    int featureStatus = getFeatureStatus(sgjVar);
                    parcel2.writeNoException();
                    parcel2.writeInt(featureStatus);
                    return true;
                case 4:
                    sgj sgjVar2 = (sgj) sgh.a(parcel, sgj.CREATOR);
                    enforceNoDataAvail(parcel);
                    int iRequestDownloadableFeature = requestDownloadableFeature(sgjVar2);
                    parcel2.writeNoException();
                    parcel2.writeInt(iRequestDownloadableFeature);
                    return true;
                case 5:
                    sgj sgjVar3 = (sgj) sgh.a(parcel, sgj.CREATOR);
                    enforceNoDataAvail(parcel);
                    ILLMService lLMService = getLLMService(sgjVar3);
                    parcel2.writeNoException();
                    sgh.f(parcel2, lLMService);
                    return true;
                case 6:
                    sgj sgjVar4 = (sgj) sgh.a(parcel, sgj.CREATOR);
                    enforceNoDataAvail(parcel);
                    ISummarizationService summarizationService = getSummarizationService(sgjVar4);
                    parcel2.writeNoException();
                    sgh.f(parcel2, summarizationService);
                    return true;
                case 7:
                    sgj sgjVar5 = (sgj) sgh.a(parcel, sgj.CREATOR);
                    IDownloadListener iDownloadListenerAsInterface = IDownloadListener.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    int iRequestDownloadableFeatureWithDownloadListener = requestDownloadableFeatureWithDownloadListener(sgjVar5, iDownloadListenerAsInterface);
                    parcel2.writeNoException();
                    parcel2.writeInt(iRequestDownloadableFeatureWithDownloadListener);
                    return true;
                case 8:
                    sgj sgjVar6 = (sgj) sgh.a(parcel, sgj.CREATOR);
                    enforceNoDataAvail(parcel);
                    ISmartReplyService smartReplyService = getSmartReplyService(sgjVar6);
                    parcel2.writeNoException();
                    sgh.f(parcel2, smartReplyService);
                    return true;
                case 9:
                    sgj sgjVar7 = (sgj) sgh.a(parcel, sgj.CREATOR);
                    enforceNoDataAvail(parcel);
                    IProofreadingService proofreadingService = getProofreadingService(sgjVar7);
                    parcel2.writeNoException();
                    sgh.f(parcel2, proofreadingService);
                    return true;
                case 10:
                    sgj sgjVar8 = (sgj) sgh.a(parcel, sgj.CREATOR);
                    enforceNoDataAvail(parcel);
                    ITextToImageService textToImageService = getTextToImageService(sgjVar8);
                    parcel2.writeNoException();
                    sgh.f(parcel2, textToImageService);
                    return true;
                case 11:
                    int apiVersion = getApiVersion();
                    parcel2.writeNoException();
                    parcel2.writeInt(apiVersion);
                    return true;
                case 12:
                    sgj sgjVar9 = (sgj) sgh.a(parcel, sgj.CREATOR);
                    IDownloadListener2 iDownloadListener2AsInterface = IDownloadListener2.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    int iRequestDownloadableFeatureWithDownloadListener2 = requestDownloadableFeatureWithDownloadListener2(sgjVar9, iDownloadListener2AsInterface);
                    parcel2.writeNoException();
                    parcel2.writeInt(iRequestDownloadableFeatureWithDownloadListener2);
                    return true;
                case 13:
                    boolean zIsPersistentModeEnabled = isPersistentModeEnabled();
                    parcel2.writeNoException();
                    int i3 = sgh.a;
                    parcel2.writeInt(zIsPersistentModeEnabled ? 1 : 0);
                    return true;
                case 14:
                    int i4 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    sgj feature = getFeature(i4);
                    parcel2.writeNoException();
                    sgh.e(parcel2, feature);
                    return true;
                case 15:
                    sgj sgjVar10 = (sgj) sgh.a(parcel, sgj.CREATOR);
                    enforceNoDataAvail(parcel);
                    IMagicRewriteService magicRewriteService = getMagicRewriteService(sgjVar10);
                    parcel2.writeNoException();
                    sgh.f(parcel2, magicRewriteService);
                    return true;
                case 16:
                    sgj sgjVar11 = (sgj) sgh.a(parcel, sgj.CREATOR);
                    enforceNoDataAvail(parcel);
                    ISuggestedTextService suggestedTextService = getSuggestedTextService(sgjVar11);
                    parcel2.writeNoException();
                    sgh.f(parcel2, suggestedTextService);
                    return true;
                case 17:
                    sgj sgjVar12 = (sgj) sgh.a(parcel, sgj.CREATOR);
                    enforceNoDataAvail(parcel);
                    ITextEmbeddingService textEmbeddingService = getTextEmbeddingService(sgjVar12);
                    parcel2.writeNoException();
                    sgh.f(parcel2, textEmbeddingService);
                    return true;
                case 18:
                    sgj sgjVar13 = (sgj) sgh.a(parcel, sgj.CREATOR);
                    enforceNoDataAvail(parcel);
                    IOcrService ocrService = getOcrService(sgjVar13);
                    parcel2.writeNoException();
                    sgh.f(parcel2, ocrService);
                    return true;
                case 19:
                    sgj sgjVar14 = (sgj) sgh.a(parcel, sgj.CREATOR);
                    enforceNoDataAvail(parcel);
                    long downloadableSizeInBytes = getDownloadableSizeInBytes(sgjVar14);
                    parcel2.writeNoException();
                    parcel2.writeLong(downloadableSizeInBytes);
                    return true;
                case 20:
                    IMockService mockService = getMockService();
                    parcel2.writeNoException();
                    sgh.f(parcel2, mockService);
                    return true;
                case 21:
                    sgj sgjVar15 = (sgj) sgh.a(parcel, sgj.CREATOR);
                    enforceNoDataAvail(parcel);
                    ITextClassificationService textClassificationService = getTextClassificationService(sgjVar15);
                    parcel2.writeNoException();
                    sgh.f(parcel2, textClassificationService);
                    return true;
                case 22:
                    sgj sgjVar16 = (sgj) sgh.a(parcel, sgj.CREATOR);
                    enforceNoDataAvail(parcel);
                    int tokenCapacity = getTokenCapacity(sgjVar16);
                    parcel2.writeNoException();
                    parcel2.writeInt(tokenCapacity);
                    return true;
                case 23:
                    sgj sgjVar17 = (sgj) sgh.a(parcel, sgj.CREATOR);
                    enforceNoDataAvail(parcel);
                    IQuestionToAnswerService questionToAnswerService = getQuestionToAnswerService(sgjVar17);
                    parcel2.writeNoException();
                    sgh.f(parcel2, questionToAnswerService);
                    return true;
                case 24:
                    sgj sgjVar18 = (sgj) sgh.a(parcel, sgj.CREATOR);
                    enforceNoDataAvail(parcel);
                    IInfoExtractionService infoExtractionService = getInfoExtractionService(sgjVar18);
                    parcel2.writeNoException();
                    sgh.f(parcel2, infoExtractionService);
                    return true;
                case 25:
                    sgj sgjVar19 = (sgj) sgh.a(parcel, sgj.CREATOR);
                    enforceNoDataAvail(parcel);
                    IBaymaxService baymaxService = getBaymaxService(sgjVar19);
                    parcel2.writeNoException();
                    sgh.f(parcel2, baymaxService);
                    return true;
                case 26:
                    sgj sgjVar20 = (sgj) sgh.a(parcel, sgj.CREATOR);
                    enforceNoDataAvail(parcel);
                    ITarsService tarsService = getTarsService(sgjVar20);
                    parcel2.writeNoException();
                    sgh.f(parcel2, tarsService);
                    return true;
                case 27:
                    sgj sgjVar21 = (sgj) sgh.a(parcel, sgj.CREATOR);
                    enforceNoDataAvail(parcel);
                    IRosieRobotService rosieRobotService = getRosieRobotService(sgjVar21);
                    parcel2.writeNoException();
                    sgh.f(parcel2, rosieRobotService);
                    return true;
                case 28:
                    sgj sgjVar22 = (sgj) sgh.a(parcel, sgj.CREATOR);
                    enforceNoDataAvail(parcel);
                    IAstroboyService astroboyService = getAstroboyService(sgjVar22);
                    parcel2.writeNoException();
                    sgh.f(parcel2, astroboyService);
                    return true;
                case 29:
                    sgj sgjVar23 = (sgj) sgh.a(parcel, sgj.CREATOR);
                    enforceNoDataAvail(parcel);
                    IOptimusService optimusService = getOptimusService(sgjVar23);
                    parcel2.writeNoException();
                    sgh.f(parcel2, optimusService);
                    return true;
                case 30:
                    sgj sgjVar24 = (sgj) sgh.a(parcel, sgj.CREATOR);
                    enforceNoDataAvail(parcel);
                    IImageDescriptionService imageDescriptionService = getImageDescriptionService(sgjVar24);
                    parcel2.writeNoException();
                    sgh.f(parcel2, imageDescriptionService);
                    return true;
                case 31:
                    sgj sgjVar25 = (sgj) sgh.a(parcel, sgj.CREATOR);
                    enforceNoDataAvail(parcel);
                    ISonnyService sonnyService = getSonnyService(sgjVar25);
                    parcel2.writeNoException();
                    sgh.f(parcel2, sonnyService);
                    return true;
                case 32:
                    int i5 = parcel.readInt();
                    int i6 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    sgj featureOrControl = getFeatureOrControl(i5, i6);
                    parcel2.writeNoException();
                    sgh.e(parcel2, featureOrControl);
                    return true;
                case 33:
                    sgj sgjVar26 = (sgj) sgh.a(parcel, sgj.CREATOR);
                    IDownloadListener2 iDownloadListener2AsInterface2 = IDownloadListener2.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    initializeSafety(sgjVar26, iDownloadListener2AsInterface2);
                    parcel2.writeNoException();
                    return true;
                case 34:
                    sgj sgjVar27 = (sgj) sgh.a(parcel, sgj.CREATOR);
                    sis sisVar = (sis) sgh.a(parcel, sis.CREATOR);
                    enforceNoDataAvail(parcel);
                    ILLMService lLMLegionService = getLLMLegionService(sgjVar27, sisVar);
                    parcel2.writeNoException();
                    sgh.f(parcel2, lLMLegionService);
                    return true;
                case 35:
                    sgj sgjVar28 = (sgj) sgh.a(parcel, sgj.CREATOR);
                    enforceNoDataAvail(parcel);
                    ICortanaService cortanaService = getCortanaService(sgjVar28);
                    parcel2.writeNoException();
                    sgh.f(parcel2, cortanaService);
                    return true;
                case 36:
                    sgj sgjVar29 = (sgj) sgh.a(parcel, sgj.CREATOR);
                    sis sisVar2 = (sis) sgh.a(parcel, sis.CREATOR);
                    enforceNoDataAvail(parcel);
                    ISummarizationService summarizationLegionService = getSummarizationLegionService(sgjVar29, sisVar2);
                    parcel2.writeNoException();
                    sgh.f(parcel2, summarizationLegionService);
                    return true;
                default:
                    return false;
            }
        }
    }

    int getApiVersion();

    IAstroboyService getAstroboyService(sgj sgjVar);

    IBaymaxService getBaymaxService(sgj sgjVar);

    ICortanaService getCortanaService(sgj sgjVar);

    long getDownloadableSizeInBytes(sgj sgjVar);

    sgj getFeature(int i);

    sgj getFeatureOrControl(int i, int i2);

    int getFeatureStatus(sgj sgjVar);

    IImageDescriptionService getImageDescriptionService(sgj sgjVar);

    IInfoExtractionService getInfoExtractionService(sgj sgjVar);

    ILLMService getLLMLegionService(sgj sgjVar, sis sisVar);

    ILLMService getLLMService(sgj sgjVar);

    IMagicRewriteService getMagicRewriteService(sgj sgjVar);

    IMockService getMockService();

    IOcrService getOcrService(sgj sgjVar);

    IOptimusService getOptimusService(sgj sgjVar);

    IProofreadingService getProofreadingService(sgj sgjVar);

    IQuestionToAnswerService getQuestionToAnswerService(sgj sgjVar);

    IRosieRobotService getRosieRobotService(sgj sgjVar);

    ISmartReplyService getSmartReplyService(sgj sgjVar);

    ISonnyService getSonnyService(sgj sgjVar);

    ISuggestedTextService getSuggestedTextService(sgj sgjVar);

    ISummarizationService getSummarizationLegionService(sgj sgjVar, sis sisVar);

    ISummarizationService getSummarizationService(sgj sgjVar);

    ITarsService getTarsService(sgj sgjVar);

    ITextClassificationService getTextClassificationService(sgj sgjVar);

    ITextEmbeddingService getTextEmbeddingService(sgj sgjVar);

    ITextToImageService getTextToImageService(sgj sgjVar);

    int getTokenCapacity(sgj sgjVar);

    void initializeSafety(sgj sgjVar, IDownloadListener2 iDownloadListener2);

    boolean isPersistentModeEnabled();

    sgj[] listFeatures();

    int requestDownloadableFeature(sgj sgjVar);

    @Deprecated
    int requestDownloadableFeatureWithDownloadListener(sgj sgjVar, IDownloadListener iDownloadListener);

    int requestDownloadableFeatureWithDownloadListener2(sgj sgjVar, IDownloadListener2 iDownloadListener2);
}
