using System;

namespace YouTubeDemo
{
    class Program
    {
        static void Main(string[] args)
        {
            CustomerManager customerManager = new CustomerManager(new Customer(), new MilitaryCreditManager());
            customerManager.GiveCredit();
            Console.ReadLine();
        }
    }
    class CreditManager
    {

        public void Calculate(int creditType)
        {
          
            Console.WriteLine("Hesaplandı");
        }
        public void Save()
        {
            Console.WriteLine("Kredi verildi");
        }

    }
    interface ICreditManager
    {
        void Calculate();
        void Save();


    }
    abstract class BaseCreditManager : ICreditManager
    {
        public abstract void Calculate();
       

        public void Save()
        {
            Console.WriteLine("Kaydedildi");
        }
    }

    class TeacherCreditManager : BaseCreditManager,ICreditManager
    {
        public override void Calculate()
        {
            Console.WriteLine("Öğretmen kredisi hesaplandı.");
        }

       
    }
    class MilitaryCreditManager : BaseCreditManager,ICreditManager
    {
        public override void Calculate()
        {
            Console.WriteLine("Asker kredisi hesaplandı.");
        }

       
    }
    class Customer
    {
        public Customer()
        {
            Console.WriteLine("Müsteri nesnesi başlatıldı");
        }
        public int Id { get; set; }
       
        public string City { get; set; }
        
    }
    class Person:Customer {
        public string FirstName { get; set; }
        public string LastName { get; set; }
        public string NationalIdentify { get; set; }
    }
    class Company:Customer
    {
        public string CompanyName { get; set; }
         public string TaxNumber { get; set; }
    }


    class CustomerManager
    {   

        private Customer _custumer;
        // metotlar arasında küçük olan customera ulaşmak için _customer eşitlendi.
        private ICreditManager _creditManager;
        public CustomerManager(Customer customer,ICreditManager creditManager) 
        {
            _custumer = customer;
            _creditManager = creditManager;
        }
           public void Save()
    {
        Console.WriteLine("Müşteri kaydedildi : " );
            
    }
        public void Delete()
        {
            Console.WriteLine("Müşteri silindi : ");

        }
        public void GiveCredit() {
            _creditManager.Calculate();
            Console.WriteLine("Kredi verildi");
        }

    }
}
